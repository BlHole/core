package com.huaxu.core.curr.basic.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: CacheThreadPool</p>
 * <p>文件描述: </p>
 * <p>内容摘要:
 *          创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程,
 *          线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/05/26 18:17</p>
 * <p>创建用户：huaxu</p>
 */
public class CacheThreadPool {

    public static AtomicInteger atomicInteger = new AtomicInteger(1);

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool(new MyFactory());
        for (int i = 0; i < 10; i++) {
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName() + "  aaaaaaa");
            });
        }
        executorService.shutdown();
    }
}
class MyFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r,"huaxu-"+CacheThreadPool.atomicInteger.getAndIncrement());
    }
}