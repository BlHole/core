package com.huaxu.core.middleware.redis.queue.normal;

import com.huaxu.core.middleware.redis.queue.normal.module.Consumer;
import com.huaxu.core.middleware.redis.queue.normal.module.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: MainTest</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/13 15:02</p>
 * <p>创建用户：huaxu</p>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest {

    @Autowired
    private Consumer consumer;

    @Autowired
    private Product product;

    @Test
    public void run() {
        Executors.newSingleThreadExecutor().execute(()->{
            int i = 0;
            while (true) {
                product.send("msg-"+i++);
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        consumer.run();
    }
}