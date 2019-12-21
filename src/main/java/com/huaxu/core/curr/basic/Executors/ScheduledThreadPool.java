package com.huaxu.core.curr.basic.Executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: ScheduledThreadPool</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/05/26 18:36</p>
 * <p>创建用户：huaxu</p>
 */
public class ScheduledThreadPool {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
//        service.schedule(()->{
//            System.out.println("延迟5秒后执行");
//        }, 5, TimeUnit.SECONDS);

        // 以上一个任务开始的时间计时
        service.scheduleAtFixedRate(()->{
            System.out.println("周期执行1");
        }, 0, 2, TimeUnit.SECONDS);// 等待0秒执行，循环每次间隔2秒

        // 以上一个任务结束时开始计时
        service.scheduleWithFixedDelay(()->{
            System.out.println("周期执行2");
        }, 0, 2, TimeUnit.SECONDS);// 等待0秒执行，循环每次间隔2秒
    }
}