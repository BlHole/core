package com.huaxu.core.curr.printJiOu;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/12 09:45
 */
public class ConsolePrintJiOu {

    private static int i = 1;

    static class PrintData implements Runnable{
        @Override
        public void run() {
            while(i<=100) {
                synchronized (ConsolePrintJiOu.class) {
                    System.out.println(Thread.currentThread().getName() + "=====" +i++);
                    ConsolePrintJiOu.class.notify();
                    try {
                        ConsolePrintJiOu.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new PrintData(),"奇数线程").start();
        new Thread(new PrintData(),"偶数线程").start();
    }
}