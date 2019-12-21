package com.huaxu.core.classLoader;

public class StaticDispatch {

    private static abstract class Human { }

    private static class Man extends Human { }

    private static class Woman extends Human { }

    private void sayHello(Human guy) {
        System.out.println("Hello, guy!");
    }

    private void sayHello(Man man) {
        System.out.println("Hello, man!");
    }

    private void sayHello(Woman woman) {
        System.out.println("Hello, woman!");
    }

    public static void main(String[] args) {

        Human man = new Man();
//        Man man = new Man();
        Human woman = new Woman();
//        Woman woman = new Woman();
        StaticDispatch dispatch = new StaticDispatch();
        dispatch.sayHello(man);
        dispatch.sayHello(woman);
    }
}