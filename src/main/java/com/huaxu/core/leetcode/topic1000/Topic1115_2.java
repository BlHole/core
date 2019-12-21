package com.huaxu.core.leetcode.topic1000;

import java.util.concurrent.Semaphore;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic1115_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/14 21:22</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic1115_2 {

    static class FooBar {
        private int n;
        private Semaphore semaphoreA;
        private Semaphore semaphoreB;
        public FooBar(int n) {
            this.n = n;
            this.semaphoreA = new Semaphore(1);
            this.semaphoreB = new Semaphore(0);
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                semaphoreA.acquire();
                printFoo.run();
                semaphoreB.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                semaphoreB.acquire();
                printBar.run();
                semaphoreA.release();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FooBar bar = new FooBar(2);

        new Thread(()->{
            try {
                bar.bar(()->{
                    System.out.print("bar");
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