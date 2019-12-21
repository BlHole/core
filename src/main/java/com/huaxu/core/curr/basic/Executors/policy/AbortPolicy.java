package com.huaxu.core.curr.basic.Executors.policy;

import java.util.concurrent.*;

/**
 *
 * ThreadPoolExecutor.AbortPolicy:丢弃任务并抛出RejectedExecutionException异常。
 * ThreadPoolExecutor.DiscardPolicy：丢弃任务，但是不抛出异常。
 * ThreadPoolExecutor.DiscardOldestPolicy：丢弃队列最前面的任务，然后重新提交被拒绝的任务
 * ThreadPoolExecutor.CallerRunsPolicy：由调用线程（提交任务的线程）处理该任务
 *
 *
 * 注意！！！！默认拒绝策略：如果抛出异常，将不再执行以后的任务提交。
 */
public class AbortPolicy{

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new LinkedBlockingQueue<Runnable>(5);
        ThreadFactory factory = r -> new Thread(r, "spring-thread-pool");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2,
                0L, TimeUnit.MILLISECONDS, blockingQueue, factory);

        for (int i = 0; i < 8; i++) {
            executor.execute(()->{
                try {
                    System.out.println("提交任务 task:" + blockingQueue.size());
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println("-----------");
        for (int i = 0; i < 2; i++) {
            executor.execute(()->{
                try {
                    System.out.println("第二次提交任务 task:" + blockingQueue.size());
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}