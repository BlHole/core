package com.huaxu.core.curr.basic.Executors.policy;

import java.util.concurrent.*;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: CallerRunsPolicy</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/19 11:50</p>
 * <p>创建用户：huaxu</p>
 */
public class CallerRunsPolicy {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new LinkedBlockingQueue<Runnable>(2);
        ThreadFactory factory = r -> new Thread(r, "spring-thread-pool");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2,
                0L, TimeUnit.MILLISECONDS, blockingQueue, factory, new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 8; i++) {
            executor.submit(()->{
                try {
                    System.out.println("提交任务 task:" + blockingQueue.size() + Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println("--------");
        for (int i = 0; i < 8; i++) {
            executor.submit(()->{
                try {
                    System.out.println("第二次提交任务 task:" + blockingQueue.size() + Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}