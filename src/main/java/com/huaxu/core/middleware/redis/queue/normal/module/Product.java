package com.huaxu.core.middleware.redis.queue.normal.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Product</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/13 15:03</p>
 * <p>创建用户：huaxu</p>
 */
@Service
public class Product {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private String key = RedisConstans.REDIS_FLAF;

    public void send(Object msg){
        redisTemplate.opsForList().leftPush(key, msg);
    }
}