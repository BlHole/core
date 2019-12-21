package com.huaxu.core.leetcode.topic1000;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic1114_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/16 20:21</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic1114_3 {

    static class Foo {

        private volatile int index = 1;
        public Foo() {}

        public void first(Runnable printFirst) throws InterruptedException {
            while (index != 1) {}
            printFirst.run();
            index = 2;
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (index != 2) {}
            printSecond.run();
            index = 3;
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (index != 3) {}
            printThird.run();
        }
    }
}