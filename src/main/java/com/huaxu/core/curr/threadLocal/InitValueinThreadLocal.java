package com.huaxu.core.curr.threadLocal;

import java.util.concurrent.TimeUnit;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: InitValueinThreadLocal</p>
 * <p>文件描述: ThreadLocal无法解决共享对象的更新问题，</p>
 * <p>创建日期: 2019/06/21 16:50</p>
 * <p>创建用户：huaxu</p>
 */
public class InitValueinThreadLocal {

    private static final StringBuilder stringB = new StringBuilder("init");

    public static ThreadLocal<StringBuilder> local = new ThreadLocal<StringBuilder>(){
        @Override
        protected StringBuilder initialValue() {
            return stringB;
        }
    };

    public static class DemeRun extends Thread {
        private StringBuilder sb = local.get();
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                sb.append("-"+i);
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new DemeRun().start();
        }
        TimeUnit.SECONDS.sleep(5);
    }

}