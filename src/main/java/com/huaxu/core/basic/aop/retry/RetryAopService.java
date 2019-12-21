package com.huaxu.core.basic.aop.retry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: RetryAopService</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/13 11:37</p>
 * <p>创建用户：huaxu</p>
 */
@Component
public class RetryAopService {

    private static final Logger log = LoggerFactory.getLogger(RetryAopService.class);
    AtomicInteger helloTimes = new AtomicInteger(0);

    @Retryable(retryTimes = 4, retryInterval = 2)
    public String hello(){
        long times = helloTimes.incrementAndGet();
        log.info("hello times:{}", times);
        if (times % 4 != 0){
            log.warn("发生异常，time：{}", LocalTime.now() );
            throw new RuntimeException("发生Hello异常");
        }
        return "hello " + "huaxu";
    }
}