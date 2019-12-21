package com.huaxu.core.classLoader;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/03 18:03
 */
public class A{

    public A() {
        System.out.println("A----执行了构造方法");
    }

    static {
        System.out.println("A----执行了静态代码块");
    }

    //静态变量
    private static String staticFiled = staticMethod();

    //赋值静态变量的静态方法
    public static String staticMethod(){
        System.out.println("A----执行了静态方法");
        return "给静态字段赋值了";
    }
}