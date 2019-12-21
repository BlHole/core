package com.huaxu.core.curr.threadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalVariableHolder {

    private static ThreadLocal<Integer> variableHolder = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static int getValue() {
        return variableHolder.get();
    }

    public static void remove() {
        variableHolder.remove();
    }

    public static void increment() {
        variableHolder.set(variableHolder.get()+1);
    }

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            executor.execute(() -> {
                try {
                    long id = Thread.currentThread().getId();
                    int before = getValue();
                    increment();
                    int after = getValue();
                    System.out.println("id:"+ id +", before: " + before + ", after: " + after);
                } finally {
                    remove();
                }
            });
        }
        executor.shutdown();
    }
}