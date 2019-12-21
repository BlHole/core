package com.huaxu.core.middleware.redis.queue.normal.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Product</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/13 15:03</p>
 * <p>创建用户：huaxu</p>
 */
@Service
public class Consumer {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private String key = RedisConstans.REDIS_FLAF;

    public void run() {
        while (true) {
            Object o = redisTemplate.opsForList().leftPop(key, 10, TimeUnit.SECONDS);
            System.out.println(String.valueOf(o));
        }
    }
}