package com.huaxu.core.curr.basic.B_exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/14 10:28</p>
 * <p>author：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        Exchanger<List<Integer>> exchanger = new Exchanger<>();
        new Thread(()->{
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            try {
                Thread.sleep(1000);
                List<Integer> exchange = exchanger.exchange(list);
                System.out.println("thread1：" + exchange);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            List<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(5);
            try {
                List<Integer> exchange = exchanger.exchange(list);
                System.out.println("thread2：" + exchange);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}