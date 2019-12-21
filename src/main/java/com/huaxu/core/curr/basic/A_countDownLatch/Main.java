package com.huaxu.core.curr.basic.A_countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/05/26 17:42</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static String[] bill = new String[2];


    public static void main(String[] args) throws InterruptedException {

//        System.out.println(Runtime.getRuntime().availableProcessors());

        CountDownLatch countDownLatch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new DownloadAlipayBill(countDownLatch));
        executorService.execute(new DownloadWeixinBill(countDownLatch));

        countDownLatch.await();
        for (String s : bill)
            System.out.println(s);
        executorService.shutdown();
    }
}
class DownloadWeixinBill implements Runnable{
    private CountDownLatch countDownLatch;

    public DownloadWeixinBill(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 下载微信账单");
        Main.bill[0] = "15";
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
    }
}

class DownloadAlipayBill implements Runnable{
    private CountDownLatch countDownLatch;

    public DownloadAlipayBill(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 下载支付宝账单");
        Main.bill[1] = "10";
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
    }
}