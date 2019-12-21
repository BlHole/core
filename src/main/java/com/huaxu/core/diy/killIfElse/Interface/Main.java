package com.huaxu.core.diy.killIfElse.Interface;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/05 20:24
 */
public class Main {

    public static void main(String[] args) {
        Red red = new Red();
        MyColor color = new MyColor(red);
        color.printColor();
    }
}