package com.huaxu.core.curr.printJiOu;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/12 09:27
 */
public class ThreadPrint {

    public static int i =0;

    void printOushu(String name){
        System.out.println(name + ":::" + i++);
    }

    void printJishu(String name){
        System.out.println(name + ":::" + i++);
    }

    public static void main(String[] args) {

        new Thread(new APrintThread()).start();
        new Thread(new BPrintThread()).start();
    }
}