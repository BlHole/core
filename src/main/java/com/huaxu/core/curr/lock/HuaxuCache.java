package com.huaxu.core.curr.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: HuaxuCache</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/04/24 16:48</p>
 * <p>创建用户：huaxu</p>
 */
public class HuaxuCache {

    static Map<String, String> cache = new HashMap<>();
    static ReentrantReadWriteLock lock =  new ReentrantReadWriteLock();
    static Lock readLock = lock.readLock();
    static Lock writeLock = lock.writeLock();

    public static String get(String key) {
        readLock.lock();
        try {
            return cache.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public static void put(String key, String content) {
        writeLock.lock();
        try {
            cache.put(key, content);
        } finally {
            writeLock.unlock();
        }
    }
}