package com.huaxu.core.curr.printJiOu;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/12 09:26
 */
public class BPrintThread extends ThreadPrint implements Runnable {

    @Override
    public void run() {
        while (i < 100) {
            synchronized (ThreadPrint.class) {
                printOushu(Thread.currentThread().getName());
                ThreadPrint.class.notify();
                try {
                    ThreadPrint.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}