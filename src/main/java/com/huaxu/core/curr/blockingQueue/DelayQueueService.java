package com.huaxu.core.curr.blockingQueue;

import java.util.Date;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: DelayQueueService</p>
 * <p>创建日期: 2019/04/18 17:20</p>
 * <p>创建用户：huaxu</p>
 */
public class DelayQueueService implements Delayed {

    private long time;

    private String name;

    public DelayQueueService(long time, String name) {
        this.time = time;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DelayQueueService{" +
                "time=" + time +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        DelayQueue<DelayQueueService> delayQueue = new DelayQueue<>();
        delayQueue.put(new DelayQueueService(start + 3*1000,"异步通知1"));
        delayQueue.put(new DelayQueueService(start + 2*1000,"异步通知2"));
        delayQueue.put(new DelayQueueService(start + 3*1000,"异步通知3"));
        delayQueue.put(new DelayQueueService(start + 4*1000,"异步通知4"));
        delayQueue.put(new DelayQueueService(start + 5*1000,"异步通知5"));

        try {
            while(true){
                DelayQueueService take = delayQueue.take();
                long end = System.currentTimeMillis();
                System.out.println("已运行 " + (end-start)/1000 + "s");
                System.out.println("take =" +take);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(this.time - System.currentTimeMillis(), TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return (int) (this.getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS));
    }
}