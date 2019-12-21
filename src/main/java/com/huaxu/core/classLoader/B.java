package com.huaxu.core.classLoader;

public class B extends A{

    public B() {
        System.out.println("B----执行了构造方法");
    }

    static {
        System.out.println("B----执行了静态代码块");
    }
    //静态变量
    private static String staticFiled = staticMethod();

    //赋值静态变量的静态方法
    public static String staticMethod(){
        System.out.println("B-----执行了静态方法");
        return "给静态字段赋值了";
    }
}