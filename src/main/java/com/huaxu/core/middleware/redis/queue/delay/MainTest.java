package com.huaxu.core.middleware.redis.queue.delay;

import com.huaxu.core.middleware.redis.queue.delay.module.DelayConsume;
import com.huaxu.core.middleware.redis.queue.delay.module.DelayProduct;
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
 * <p>创建日期: 2019/07/13 15:54</p>
 * <p>创建用户：huaxu</p>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest {

    @Autowired
    private DelayProduct delayProduct;

    @Autowired
    private DelayConsume delayConsume;

    @Test
    public void index() throws InterruptedException {

        delayProduct.delaySend();
        for (int i = 0; i < 10; i++) {
            Executors.newSingleThreadExecutor().execute(()->{
                delayConsume.consume();
            });
        }
        TimeUnit.SECONDS.sleep(10);
    }
}