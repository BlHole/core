package com.huaxu.core.curr.condition;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: BoundedQueue</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/04/24 18:26</p>
 * <p>创建用户：huaxu</p>
 */
public class BoundedQueue<T> {

    private Object[] items;
    private int addIndex,removeIndex,count;
    private Lock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public BoundedQueue(int size) {
        items = new Object[size];
    }

    public void add(T t) throws InterruptedException {
        lock.lock();

        try {
            while (count == items.length){
                notFull.await();
            }
            items[addIndex] = t;
            ++count;

            if (++addIndex == count)
                addIndex = 0;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public T remove() throws InterruptedException {
        lock.lock();

        try {
            while (0 == items.length){
                notEmpty.await();
            }
            Object result = items[removeIndex];
            items[removeIndex] = null;
            --count;

            if (++removeIndex == count)
                removeIndex = 0;
            notFull.signal();
            return (T)result;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
    }
}