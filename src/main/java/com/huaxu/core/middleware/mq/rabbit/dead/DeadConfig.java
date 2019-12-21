package com.huaxu.core.middleware.mq.rabbit.dead;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: DeadConfig</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/08 16:39</p>
 * <p>创建用户：huaxu</p>
 */
//@Configuration
public class DeadConfig {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 死信队列 交换机标识符
     */
    private static final String X_DEAD_LETTER_EXCHANGE = "x-dead-letter-exchange";
    /**
     * 死信队列交换机routing-key标识符
     */
    private static final String X_DEAD_LETTER_ROUTING_KEY = "x-dead-letter-routing-key";
    /**
     * 死信队列消息的超时时间枚举
     */
    private static final String X_MESSAGE_TTL = "x-message-ttl";




    @Bean
    public TopicExchange emailExchange() {
        return (TopicExchange)ExchangeBuilder.topicExchange("emailExchange").durable(true).build();
    }

    @Bean
    public TopicExchange retryExchange() {
        return (TopicExchange)ExchangeBuilder.topicExchange("retryExchange").durable(true).build();
    }

    @Bean
    public TopicExchange faildExchange() {
        return (TopicExchange)ExchangeBuilder.topicExchange("faildExchange").durable(true).build();
    }


    @Bean
    public Queue emailQueue() {
        return new Queue("emailQueue");
    }

    @Bean
    public Queue retryQueue() {
        Map<String, Object> args = new ConcurrentHashMap<>(3);
        // 将消息重新投递到emailExchange中
        args.put(X_DEAD_LETTER_EXCHANGE, "emailExchange");
        args.put(X_DEAD_LETTER_ROUTING_KEY, "email.topic.retry");
        //消息在队列中延迟30s后超时，消息会重新投递到x-dead-letter-exchage对应的队列中，routingkey为自己指定
        args.put(X_MESSAGE_TTL, 30 * 1000);
        return QueueBuilder.durable("retryQueue").withArguments(args).build();
    }

    @Bean
    public Queue faildQueue() {
        return QueueBuilder.durable("faildQueue").build();
    }

    @Bean
    public Binding topicQueueBinding(@Qualifier("emailQueue") Queue queue,
                                     @Qualifier("emailExchange") TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("email.topic.*");
    }
    @Bean
    public Binding retryDirectBinding(@Qualifier("retryQueue") Queue queue,
                                      @Qualifier("retryExchange") TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("email.retry.*");
    }
    @Bean
    public Binding failDirectBinding(@Qualifier("faildQueue") Queue queue,
                                     @Qualifier("faildExchange") TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("email.faild.*");
    }


    @Bean
    public AmqpTemplate amqpTemplate(){
        // 在消息没有被路由到合适的队列情况下，Broker会将消息返回给生产者，
        // 为true时如果Exchange根据类型和消息Routing Key无法路由到一个合适的Queue存储消息，
        // Broker会调用Basic.Return回调给handleReturn()，再回调给ReturnCallback，将消息返回给生产者。
        // 为false时，丢弃该消息
        rabbitTemplate.setMandatory(true);

        // 消息确认，需要配置 spring.rabbitmq.publisher-confirms = true
        rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {

            //根据返回的状态，生产者可以处理失败与成功的相应信息，比如发送失败，可重发，转发或者存入日志等
            //if(ack){
            //	correlationData.getId()为message唯一标识，需要生产者发送message时传入自定义的correlationData才能获取到，否则为null
            //	//do something
            //}else{
            //	correlationData.getId()
            //	//do something
            //}

            //此处只做打印，不对生产者发送失败的信息处理
            System.out.println("------------------------------------------------");
            System.out.println("ConfirmCallBackListener：correlationData=" + correlationData + "，ack=" + ack + "，cause=" + cause);
            System.out.println("------------------------------------------------");
        });

        // 消息发送失败返回到队列中，需要配置spring.rabbitmq.publisher-returns = true
        rabbitTemplate.setReturnCallback((message, replyCode, replyText, exchange, routingKey) -> {

            System.out.println("------------------------------------------------");
            System.out.println("ReturnCallBackListener：message=" + new String(message.getBody()) + "，replyCode=" + replyCode + "，replyText=" + replyText + "，exchange=" + exchange + "，routingKey=" + routingKey);
            System.out.println("------------------------------------------------");

        });

        return rabbitTemplate;
    }

}