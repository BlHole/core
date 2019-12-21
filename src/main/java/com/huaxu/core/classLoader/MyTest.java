package com.huaxu.core.classLoader;

public class MyTest {

    public static void main(String[] args) {
        try {

            String classz = "com.huaxu.putGet.classLoader.B";
            Class.forName(classz).newInstance();
            System.out.println("#########分割符(上面是Class.forName的加载过程，下面是ClassLoader的加载过程)##########");
            ClassLoader.getSystemClassLoader().loadClass(classz).newInstance();
            System.out.println("#########分割符(上面是ClassLoader的加载过程，下面是new的加载过程)##########");
            new B();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}