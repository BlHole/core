package com.huaxu.core.middleware.redis.bitmap;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
@RunWith(SpringRunner.class)
@SpringBootTest
public class BitMapTest {

    @Autowired
    private BitMapService bitMapService;

    @Test
    public void doSign() throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String userId = "6666";
        Assert.assertTrue(bitMapService.doSign(userId, formatter.parse("2019-02-01")));
        Assert.assertTrue(bitMapService.doSign(userId, formatter.parse("2019-02-02")));
        Assert.assertTrue(bitMapService.doSign(userId, formatter.parse("2019-02-03")));
        Assert.assertTrue(bitMapService.doSign(userId, formatter.parse("2019-02-04")));
        Assert.assertTrue(bitMapService.doSign(userId, formatter.parse("2019-02-05")));

        Assert.assertTrue(bitMapService.checkSign(userId, formatter.parse("2019-02-01")));
        Assert.assertTrue(bitMapService.checkSign(userId, formatter.parse("2019-02-02")));
        Assert.assertTrue(bitMapService.checkSign(userId, formatter.parse("2019-02-03")));
        Assert.assertTrue(bitMapService.checkSign(userId, formatter.parse("2019-02-04")));
        Assert.assertTrue(bitMapService.checkSign(userId, formatter.parse("2019-02-05")));
        Assert.assertTrue(5 == bitMapService.getSignCount(userId, formatter.parse("2019-02-08")));

        Assert.assertFalse(bitMapService.checkSign(userId, formatter.parse("2019-02-06")));
        Assert.assertFalse(bitMapService.doSign(userId, formatter.parse("2019-02-05")));
    }
}