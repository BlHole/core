package com.huaxu.core.curr.basic.A_cyclicBarrier;

import java.util.concurrent.*;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/05/26 22:18</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, ()->{
            System.out.println("人到齐了，开工干活！");
        });

        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 3; i++) {
            service.execute(()->{
                System.out.println("来了一个人");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
            TimeUnit.SECONDS.sleep(1);
        }
        service.shutdown();
    }
}