package com.huaxu.core.curr.basic.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: SingleThreadExecutor</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/05/26 18:46</p>
 * <p>创建用户：huaxu</p>
 */
public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            service.execute(()->{
                System.out.println(Thread.currentThread().getName());
            });
        }
    }
}