package com.huaxu.core.curr.basic.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: FixedThreadPool</p>
 * <p>文件描述: </p>
 * <p>内容摘要:
 *          创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
 *          定长线程池的大小最好根据系统资源进行设置。
 *          如Runtime.getRuntime().availableProc.essors()</p>
 *
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/05/26 18:22</p>
 * <p>创建用户：huaxu</p>
 */
public class FixedThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            executorService.execute(()->{
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}