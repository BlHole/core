package com.huaxu.core.ci.testNG;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/10 15:13</p>
 * <p>author：huaxu</p>
 */
public class ConcurrCount {

    private static AtomicInteger count = new AtomicInteger(0);

    public static int incr() {
        return count.incrementAndGet();
    }

    private static volatile Integer countVl = new Integer(0);

    public static int decc() {
        return ++countVl;
    }
}