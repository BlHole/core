package com.huaxu.core.curr.threadExecutot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/01 09:43
 */
public class NoRunThreadTry {

    private static Logger logger = LoggerFactory.getLogger(NoRunThreadTry.class);

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1));

        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                logger.info("======1111=======");
            }
        });

        TimeUnit.SECONDS.sleep(5);

        poolExecutor.execute(new RunA());
//        poolExecutor.execute(()->{
//            System.out.println("21312312");
//        });
    }
}

class RunA implements Runnable{

    private static Logger logger = LoggerFactory.getLogger(RunA.class);

    @Override
    public void run() {
        int count = 0;
        while (true) {
            count++;
            logger.info("========2222======");

            if (10 == count) {
                logger.info("=======" + 1/0);
            }

            if (20 == count) {
                logger.info("=====count " + count + "=====");
                break;
            }
        }
    }
}