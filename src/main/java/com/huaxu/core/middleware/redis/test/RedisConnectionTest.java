package com.huaxu.core.middleware.redis.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: RedisConnectionTest</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/11 09:43</p>
 * <p>创建用户：huaxu</p>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConnectionTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void test() {
        redisTemplate.opsForValue().set("douyu", 12);
        redisTemplate.opsForValue().increment("douyu");
        redisTemplate.opsForValue().set("spring", "helloWorld");
        Assert.assertTrue("helloWorld".equals(redisTemplate.opsForValue().get("spring")));
    }
}