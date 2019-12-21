package com.huaxu.core.classLoader.weakReference;

import java.util.concurrent.TimeUnit;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/29 10:39
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        Salad salad = new Salad(new Apple("红富士"));
        System.out.println("Apple:" + salad.get());

        System.gc();

        TimeUnit.SECONDS.sleep(5);
        if (salad == null) {
            System.out.println("clear salad");
        }

    }
}