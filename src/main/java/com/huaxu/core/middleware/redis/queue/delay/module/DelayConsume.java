package com.huaxu.core.middleware.redis.queue.delay.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: DelayProduct</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/13 15:57</p>
 * <p>创建用户：huaxu</p>
 */
@Service
public class DelayConsume {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private String key = DelayRedisConstans.REDIS_KEY;

    public void consume() {
        while (true) {
            Set<Object> objects = redisTemplate.opsForZSet().rangeByScore(key, 0, new Date().getTime(), 0, 1);
            if (objects.isEmpty()) continue;
            Object next = objects.iterator().next();
            Long remove = redisTemplate.opsForZSet().remove(key, next);
            if (remove > 0) {// 抢占成功的线程
                System.out.println("success delay consume " + next);
            } else {
                System.out.println("fail delay consume");
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}