package com.huaxu.core.curr.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/09/30 10:16</p>
 * <p>@author：huaxu</p>
 */
public class TestReentrantlock {

    private static ReentrantLock lock = new ReentrantLock(false);


    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            threadPool.execute(()->{
                System.out.println("线程:" + Thread.currentThread().getName()+"进入");
                getLock(lock);
            });
        }
    }

    private static void getLock(ReentrantLock lock) {
        try {
            lock.lock();
            System.out.println("线程:" + Thread.currentThread().getName()+"获取锁");
            TimeUnit.MILLISECONDS.sleep(1);
            lock.unlock();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}