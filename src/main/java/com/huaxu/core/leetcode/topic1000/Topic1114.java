package com.huaxu.core.leetcode.topic1000;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic1114</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/14 14:59</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic1114 {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        new Thread(()->{
            try {
                foo.third(()->{
                    System.out.println("third");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                foo.second(()->{
                    System.out.println("two");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                foo.first(()->{
                    System.out.println("first");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        TimeUnit.SECONDS.sleep(4);
    }

    static class Foo {

        private Semaphore one = new Semaphore(0);
        private Semaphore two = new Semaphore(0);
        public Foo() {}

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            one.release();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            one.acquire();
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            two.release();
        }

        public void third(Runnable printThird) throws InterruptedException {
            two.acquire();
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}