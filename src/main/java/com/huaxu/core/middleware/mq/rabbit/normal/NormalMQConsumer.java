package com.huaxu.core.middleware.mq.rabbit.normal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Consumer</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/08 14:33</p>
 * <p>创建用户：huaxu</p>
 */
@Component
public class NormalMQConsumer {

    private static final Logger logger = LoggerFactory.getLogger(NormalMQProducer.class);

    @RabbitHandler
    @RabbitListener(queues = "message")
    public void process(String Str) {
        logger.info("接收消息："+Str);
        logger.info("接收消息时间："+new Date());
    }
}