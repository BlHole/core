package com.huaxu.core.middleware.mq.rabbit.dead;

import com.rabbitmq.client.Channel;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Producer</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/08 14:33</p>
 * <p>创建用户：huaxu</p>
 */
@Component
public class DeadMQProducer {


    @Autowired
    private AmqpTemplate rabbitTemplate;

    public static final String EXCHANGE = "emailExchange";
    public static final String ROUTING_KEY = "email.topic.queue";

    public void sendDead(){
        for (int i = 100; i < 105; i++){
            rabbitTemplate.convertAndSend(EXCHANGE,ROUTING_KEY,"message:"+(i+1));
        }
    }
}