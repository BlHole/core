package com.huaxu.core.middleware.spring.paramBind;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomParamBinding {}