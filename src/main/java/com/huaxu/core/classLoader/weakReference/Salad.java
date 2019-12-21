package com.huaxu.core.classLoader.weakReference;

import java.lang.ref.WeakReference;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/29 10:38
 */
public class Salad extends WeakReference<Apple> {

    public Salad(Apple referent) {
        super(referent);
    }
}