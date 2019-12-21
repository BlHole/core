package com.huaxu.core.curr.basic.Executors.policy;

import java.util.concurrent.*;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: DiyPolicy</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/19 11:52</p>
 * <p>创建用户：huaxu</p>
 */
public class DiyPolicy implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("自定义拒绝机制 ----- 开始");
//        executor.getQueue().add(r);
        r.run();
        System.out.println("自定义拒绝机制 ----- 结束");
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new LinkedBlockingQueue<Runnable>(4);
        ThreadFactory factory = r -> new Thread(r, "spring-thread-pool");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2,
                0L, TimeUnit.MILLISECONDS, blockingQueue, factory, new DiyPolicy());

        for (int i = 0; i < 80; i++) {
            executor.submit(()->{
                System.out.println("提交任务 task:" + blockingQueue.size() +"  "+ Thread.currentThread().getName());
            });
        }
        System.out.println("--------");
        for (int i = 0; i < 80; i++) {
            executor.submit(()->{
                System.out.println("第二次提交任务 task:" + blockingQueue.size());
            });
        }
    }
}