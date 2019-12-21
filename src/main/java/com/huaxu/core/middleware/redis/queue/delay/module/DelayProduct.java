package com.huaxu.core.middleware.redis.queue.delay.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: DelayProduct</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/13 15:57</p>
 * <p>创建用户：huaxu</p>
 */
@Service
public class DelayProduct {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private String key = DelayRedisConstans.REDIS_KEY;

    public void delaySend() {
        redisTemplate.opsForZSet().add(key, UUID.randomUUID().toString(), new Date().getTime()+5000);
    }
}