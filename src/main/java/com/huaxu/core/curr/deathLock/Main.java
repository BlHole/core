package com.huaxu.core.curr.deathLock;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/20 14:41</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            while (!Thread.interrupted()) {
                synchronized (Thread1.class) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (Thread2.class) {
                        System.out.println("thread1 running");
                    }
                }
            }
        }
    }

   static class Thread2 implements Runnable {
        @Override
        public void run() {
            while (!Thread.interrupted()) {
                synchronized (Thread2.class) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (Thread1.class) {
                        System.out.println("thread2 running");
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }
}