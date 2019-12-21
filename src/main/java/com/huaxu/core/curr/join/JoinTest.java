package com.huaxu.core.curr.join;

import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: JoinTest</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/27 14:59</p>
 * <p>创建用户：huaxu</p>
 */
public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            System.out.println("aaaa");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("dddd");
        });

        thread.start();
        thread.join();
        System.out.println("end");
    }
}