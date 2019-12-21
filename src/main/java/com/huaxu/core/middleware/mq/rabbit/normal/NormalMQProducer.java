package com.huaxu.core.middleware.mq.rabbit.normal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Producer</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/08 14:33</p>
 * <p>创建用户：huaxu</p>
 */
@Component
public class NormalMQProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;
    private static final Logger logger = LoggerFactory.getLogger(NormalMQProducer.class);

    public String send(){
        String context = "简单消息发送";
        logger.info("简单消息发送时间："+new Date());
        amqpTemplate.convertAndSend("message", context);
        return "发送成功";
    }
}