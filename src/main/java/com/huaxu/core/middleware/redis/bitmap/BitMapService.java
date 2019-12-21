package com.huaxu.core.middleware.redis.bitmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * 基于Redis位图的用户签到功能实现类
 * <p>
 * 实现功能：
 * 1. 用户签到
 * 2. 检查用户是否签到
 * 3. 获取用户签到次数
 * 4. 获取用户连续签到次数
 * 5. 获取用户每天的签到情况
 */
@Service
public class BitMapService {


    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    // 用户签到
    public boolean doSign(String userId, Date date) {
        return !redisTemplate.opsForValue().setBit(buildBitKey(userId, date), getOffset(date), true);
    }

    // 检查用户是否签到
    public boolean checkSign(String userId, Date date) {
        return redisTemplate.opsForValue().getBit(buildBitKey(userId, date),getOffset(date));
    }

    // 获取用户签到次数
    public Long getSignCount(String userId, Date date) {
        return redisTemplate.execute((RedisConnection connection)->{
            return connection.bitCount(buildBitKey(userId, date).getBytes(), 0L, getOffset(date));
        });
    }

    private String buildBitKey(final String userId, Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        return "u:"+userId+":"+year+":"+month;
    }

    private int getOffset(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
}