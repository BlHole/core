package com.huaxu.core.leetcode.topic1000;

import java.util.concurrent.CountDownLatch;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic1115_3</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/14 21:31</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic1115_3 {

    static class FooBar {
        private int n;
        private CountDownLatch countDownLatchA;
        private CountDownLatch countDownLatchB;

        public FooBar(int n) {
            this.n = n;
            this.countDownLatchA = new CountDownLatch(1);
            this.countDownLatchB = new CountDownLatch(1);
        }

        public void foo(Runnable printFoo) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                countDownLatchA.await();
                printFoo.run();
                countDownLatchB.countDown();
                countDownLatchA = new CountDownLatch(1);
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                countDownLatchA.countDown();
                countDownLatchB.await();
                printBar.run();
                countDownLatchB = new CountDownLatch(1);
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