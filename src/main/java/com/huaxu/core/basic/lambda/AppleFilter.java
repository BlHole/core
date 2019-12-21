package com.huaxu.core.basic.lambda;

import com.huaxu.core.basic.lambda.model.Apple;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/06 13:24
 */
@FunctionalInterface
public interface AppleFilter {

    boolean accept(Apple apple);

    /**
     * @program putGet
     * @description:
     * @author: huaxu
     * @create: 2019/04/06 13:58
     */
}
