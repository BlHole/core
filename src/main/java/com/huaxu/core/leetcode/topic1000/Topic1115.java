package com.huaxu.core.leetcode.topic1000;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic1115</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/14 20:55</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic1115 {

    static class FooBar {
        private int n;
        private Lock lock;
        private volatile Boolean flag;

        public FooBar(int n) {
            this.n = n;
            this.flag = true;
            this.lock = new ReentrantLock(true);
        }

        public void foo(Runnable printFoo) throws InterruptedException {
            for (int i = 0; i < n;) {
                lock.lock();
                if (flag) {
                    printFoo.run();
                    flag = false;
                    i++;
                }
                lock.unlock();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {
            for (int i = 0; i < n;) {
                lock.lock();
                if (!flag) {
                    printBar.run();
                    flag = true;
                    i++;
                }
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
         FooBar bar = new FooBar(2);

        new Thread(()->{
            try {
                bar.bar(()->{
                    System.out.println("bar");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(100);
        new Thread(()->{
            try {
                bar.foo(()->{
                    System.out.print("foo");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}