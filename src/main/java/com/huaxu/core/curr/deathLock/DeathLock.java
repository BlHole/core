package com.huaxu.core.curr.deathLock;

import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Test2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/24 13:16</p>
 * <p>创建用户：huaxu</p>
 */
public class DeathLock {

    class ThreadLock extends Thread {
        private String flagA;
        private String flagB;

        public ThreadLock(String flagA, String flagB, String name){
            this.flagA = flagA;
            this.flagB = flagB;
            this.setName(name);
        }

        @Override
        public void run() {
            synchronized (flagA) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (flagB) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        String flagA = new String("flagA");
        String flagB = new String("flagA");
        new DeathLock().new ThreadLock(flagA, flagB, "A").start();
        new DeathLock().new ThreadLock(flagB, flagA, "B").start();
    }
}