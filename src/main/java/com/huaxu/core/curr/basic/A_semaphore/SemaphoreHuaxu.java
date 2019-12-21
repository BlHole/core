package com.huaxu.core.curr.basic.A_semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/12 10:52
 */
public class SemaphoreHuaxu {

    static int i = 1;
    static int sum = 20;
    static int threadSum = 2;


    static class PrintConsole implements Runnable{

        private Semaphore semaphore;
        public PrintConsole(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {

            while (true) {
                try {
                    semaphore.acquire(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i <= sum) {
                    System.out.println(Thread.currentThread().getName() +"==="+ i++);
                }
                semaphore.release(1);
            }
        }
    }

    public static void main(String[] args) {

        final Semaphore semaphore = new Semaphore(1, true);
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int j = 0; j < threadSum; j++) {
            executor.execute(new Thread(new PrintConsole(semaphore)));
        }
    }
}