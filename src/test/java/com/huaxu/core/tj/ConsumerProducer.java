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
public class ConsumerProducer {

    private static Integer SIZE = 10;
    private static Integer INDEX = 0;
    private static Lock lock = new ReentrantLock();
    private static Condition notFull = lock.newCondition();
    private static Condition notEmpty = lock.newCondition();

    static class Consumer extends Thread{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                try {
                    while (INDEX == 0) {
                        try {
                            notEmpty.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("消费者消费" + INDEX--);
                    notFull.signalAll();

                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class Producer extends Thread{

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                try {
                    while (INDEX == SIZE) {
                        try {
                            notFull.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("生产者生产" + INDEX++);
                    notEmpty.signalAll();

                } finally {
                    lock.unlock();
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