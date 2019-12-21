package com.huaxu.core.curr.putGet;

import java.util.Queue;

class Waiter extends Thread {

    private Queue<Food> queue;

    public Waiter(Queue<Food> queue, String name) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            Food food;
            synchronized (queue) {
                while (queue.size() < 1) {
                    try {
                        System.out.println("队列元素个数为：" + queue.size() + "，" + getName() + "抽根烟等待中");
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                food = queue.remove();
                System.out.println(getName() + " 获取到：" + food);
                queue.notifyAll();
            }

            SleepUtil.randomSleep();    //模拟服务员端菜时间
        }
    }
}