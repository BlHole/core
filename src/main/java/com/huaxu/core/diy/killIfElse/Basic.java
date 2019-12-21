package com.huaxu.core.diy.killIfElse;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/05 20:14
 */
public class Basic {

    public static void main(String[] args) {
        String color = "";
        if ("blue".equals(color)) {
            System.out.println("This is blue");
        } else if ("white".equals(color)) {
            System.out.println("This is white");
        } else if ("green".equals(color)) {
            System.out.println("This is green");
        } else if ("yellow".equals(color)) {
            System.out.println("This is yellow");
        }
    }
}