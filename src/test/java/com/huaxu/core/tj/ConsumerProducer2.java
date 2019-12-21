package com.huaxu.core.tj;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/13 11:29</p>
 * <p>author：huaxu</p>
 */
public class ConsumerProducer2 {

    private static Integer SIZE = 10;
    private static Integer INDEX = 0;
    private static final String LOCK = "lock";

    static class Consumer extends Thread{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    try {
                        while (INDEX == 0) {
                            LOCK.wait();
                        }
                        System.out.println("消费者消费" + INDEX--);
                        LOCK.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Producer extends Thread{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    try {
                        while (INDEX == SIZE) {
                            LOCK.wait();
                        }
                        System.out.println("生产者生产" + INDEX++);
                        LOCK.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Producer().start();
        new Consumer().start();
        new Consumer().start();
    }
}