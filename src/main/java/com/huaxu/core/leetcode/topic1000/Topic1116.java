package com.huaxu.core.leetcode.topic1000;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/18 15:09</p>
 * <p>author：huaxu</p>
 */
public class Topic1116 {

    static class ZeroEvenOdd {

        private Semaphore zero_S;
        private Semaphore odd_S;
        private Semaphore even_S;
        private int n;

        public ZeroEvenOdd(int n) {
            this.n = n;
            this.zero_S = new Semaphore(1);
            this.odd_S = new Semaphore(0);
            this.even_S = new Semaphore(0);
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i ++) {
                zero_S.acquire(1);
                printNumber.accept(0);
                if ((i & 1) == 0) {
                    odd_S.release(1);
                } else {
                    even_S.release(1);
                }
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 2; i <= n; i += 2) {
                even_S.acquire(1);
                printNumber.accept(i);
                zero_S.release(1);
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i += 2) {
                odd_S.acquire(1);
                printNumber.accept(i);
                zero_S.release(1);
            }
        }
    }
}