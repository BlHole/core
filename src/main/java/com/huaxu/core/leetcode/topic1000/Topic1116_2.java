package com.huaxu.core.leetcode.topic1000;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/18 15:25</p>
 * <p>author：huaxu</p>
 */
public class Topic1116_2 {

    public static void main(String[] args) {
        System.out.println(0 & 1);
        System.out.println( 0 % 2 == (0 & 1));
    }

    static class ZeroEvenOdd {

        private int n;
        private volatile int num = 0;

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i ++) {
                synchronized (this) {
                    while ((num & 1) != 0) {
                        this.wait();
                    }
                    printNumber.accept(0);
                    num ++;
                    this.notifyAll();
                }
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 2; i <= n; i += 2) {
                synchronized (this) {
                    while ((num & 1) == 0 || (num % 4) != 3) {
                        this.wait();
                    }
                    printNumber.accept(i);
                    num ++;
                    this.notifyAll();
                }
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i += 2) {
                synchronized (this) {
                    while ((num & 1) == 0 || (num % 4) != 1) {
                        this.wait();
                    }
                    printNumber.accept(i);
                    num ++;
                    this.notifyAll();
                }
            }
        }
    }
}