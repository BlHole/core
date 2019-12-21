package com.huaxu.core.curr.Z_volatile;

import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: VolatileTest</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/30 16:18</p>
 * <p>创建用户：huaxu</p>
 */
public class VolatileTest {


    public static boolean stop = false;
    public static  Integer i = 0;
//    public static int i = 0;
//    public static volatile int i = 0;

    /**
     *  @Date: 5:06 PM 2019/7/30
     *  @Author: huaxu
     *  @Description:
     *           去掉注释会有不一样
     */
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            while (!stop) {
                i++;
            }
            System.out.println("sub thread death .... ");
        });

        thread.start();
        TimeUnit.SECONDS.sleep(1);
        stop = true;
        System.out.println("main death...");
        thread.join();
    }
}