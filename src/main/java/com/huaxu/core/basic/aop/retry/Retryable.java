package com.huaxu.core.basic.aop.retry;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Retryable {
    int retryTimes() default 3;
    int retryInterval() default 1;
}
