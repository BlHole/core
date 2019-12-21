package com.huaxu.core.middleware.mq.rabbit.dead;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: DeadMQTest</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/08 16:54</p>
 * <p>创建用户：huaxu</p>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DeadMQTest {

    @Autowired
    private DeadMQProducer deadMQProducer;

    @Test
    public void test() {
        deadMQProducer.sendDead();
    }
}