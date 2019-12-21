package com.huaxu.core.jvm.initClass;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: LoadLoopClass</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/04/28 15:40</p>
 * <p>创建用户：huaxu</p>
 */
public class LoadLoopClass {

    static{
        if (true) {
            System.out.println("init LoadloopClass ....");
            while(true){

            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + " start");
                LoadLoopClass loadLoopClass = new LoadLoopClass();
                System.out.println(Thread.currentThread() + " end");
            }
        };

        Thread thread1 = new Thread(runnable, "thread1");
        Thread thread2 = new Thread(runnable, "thread2");

        thread1.start();
        thread2.start();
    }

}