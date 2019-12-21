package com.huaxu.core.basic.T;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/01 11:36
 */
public interface Translatable<T extends Translatable<T>> {
    T getEngine();
}