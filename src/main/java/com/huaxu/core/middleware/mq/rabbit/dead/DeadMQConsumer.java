package com.huaxu.core.middleware.mq.rabbit.dead;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Consumer</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/08 14:33</p>
 * <p>创建用户：huaxu</p>
 */
@Component
public class DeadMQConsumer {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    private static final Logger log = LoggerFactory.getLogger(DeadMQProducer.class);

    @RabbitListener(queues = "faildQueue")
    public void faindQueue(Message message, Channel channel) throws IOException {

        log.info("处理三次重试都失败的订单:{}", new String(message.getBody()));
        log.info("写入数据库");
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }


    @RabbitListener(queues = "emailQueue")
    public void sendMail(Message message, Channel channel) throws IOException {

        try {
            /** 手动抛出异常,测试消息重试 */
            int i = 1 / 0;
        } catch (Exception e) {

            long retryCount = getRetryCount(message.getMessageProperties());
            if (retryCount >= 3) {
                /** 重试次数超过3次,则将消息发送到失败队列等待特定消费者处理或者人工处理 */
                try {
                    rabbitTemplate.convertAndSend("faildExchange", "email.faild.myfaild", message);
                    log.info("消费者消费消息在重试3次后依然失败，将消息发送到faild队列,发送消息:" + new String(message.getBody()));
                }
                catch (Exception e1) {
                    log.error("消息在发送到faild队列的时候报错:" + e1.getMessage() + ",原始消息:" + new String(message.getBody()));
                }

            } else {
                try {
                    /** 重试次数不超过3次,则将消息发送到重试队列等待重新被消费（重试队列延迟超时后信息被发送到相应死信队列重新消费，即延迟消费）*/
                    rabbitTemplate.convertAndSend("retryExchange", "email.retry.myRetry", message);
                    log.info("消费者消费失败，消息发送到重试队列;" + "原始消息：" + new String(message.getBody()) + ";第" + (retryCount + 1) + "次重试");
                } catch (Exception e1) {
                    log.error("消息发送到重试队列的时候，异常了:" + e1.getMessage() + ",重新发送消息");
                }
            }
        } finally {
            /**
             * 无论消费成功还是消费失败,都要手动进行ack,因为即使消费失败了,也已经将消息重新投递到重试队列或者失败队列
             * 如果不进行ack,生产者在超时后会进行消息重发,如果消费者依然不能处理，则会存在死循环
             */
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        }
    }

    /**
     * 获取消息被重试的次数
     */
    public long getRetryCount(MessageProperties messageProperties) {
        Long retryCount = 0L;
        if (null != messageProperties) {
            List<Map<String, ?>> deaths = messageProperties.getXDeathHeader();
            if(deaths != null && deaths.size()>0){
                Map<String, Object> death = (Map<String, Object>)deaths.get(0);
                retryCount = (Long) death.get("count");
            }
        }
        return retryCount;
    }
}