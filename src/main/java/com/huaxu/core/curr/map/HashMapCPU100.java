package com.huaxu.core.curr.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/15 19:57
 */
public class HashMapCPU100 {

        private HashMap<Integer,Integer> map = new HashMap<>(2);
        private Map<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>(2);

    public HashMapCPU100() {

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i), Integer.valueOf(i));
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    map.put(new Integer(i),Integer.valueOf(i));
                }
            }
        };
        t1.start();
        t2.start();
    }

    public HashMapCPU100(boolean type) {

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    concurrentHashMap.put(new Integer(i), Integer.valueOf(i));
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    concurrentHashMap.put(new Integer(i),Integer.valueOf(i));
                }
            }
        };
        t1.start();
        t2.start();
    }

    public static void main(String[] args) throws InterruptedException {
        new HashMapCPU100();
        new HashMapCPU100(true);
        TimeUnit.SECONDS.sleep(1000);
    }
}