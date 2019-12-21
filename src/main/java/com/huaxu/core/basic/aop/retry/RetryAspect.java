package com.huaxu.core.basic.aop.retry;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RetryAspect {

    private static final Logger log = LoggerFactory.getLogger(RetryAspect.class);

    @Pointcut("@annotation(com.huaxu.core.basic.aop.retry.Retryable)")
    private void retryMethodCall(){}

    @Around("retryMethodCall()")
    public Object retry(ProceedingJoinPoint joinPoint) throws InterruptedException {
        // 获取重试次数和重试间隔
        Retryable retry = ((MethodSignature)joinPoint.getSignature()).getMethod().getAnnotation(Retryable.class);
        int maxRetryTimes = retry.retryTimes();
        int retryInterval = retry.retryInterval();

        Throwable error = new RuntimeException();
        for (int retryTimes = 1; retryTimes <= maxRetryTimes; retryTimes++){
            try {
                Object result = joinPoint.proceed();
                return result;
            } catch (Throwable throwable) {
                error = throwable;
                log.warn("调用发生异常，开始重试，retryTimes:{}", retryTimes);
            }
            Thread.sleep(retryInterval * 1000);
        }
        throw new RuntimeException("重试次数耗尽", error);
    }
}
