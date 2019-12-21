package com.huaxu.core.curr.Z_volatile;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: MemoryVisibilityTest</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/30 16:56</p>
 * <p>创建用户：huaxu</p>
 */
public class MemoryVisibilityTest {
    public static int a=0,b=0;
    public static int x=0,y=0;


    /**
     *  @Date: 5:06 PM 2019/7/30
     *  @Author: huaxu
     *  @Description:
     *           去掉注释会有不一样，
     */
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()->{
            a = 1;
            x = b;
        });

        Thread thread2 = new Thread(()->{
            b = 2;
            y = a;
        });

        thread1.start();
        thread2.start();
//        thread2.join();
//        thread1.join();

        System.out.println("x=" + x + " && " + "y=" + y );
    }
}