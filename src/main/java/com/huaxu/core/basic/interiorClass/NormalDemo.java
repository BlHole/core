package com.huaxu.core.basic.interiorClass;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: 关于java的内部类</p>
 * <p>创建日期: 2019/06/19 14:01</p>
 * <p>创建用户：huaxu</p>
 *
 *
 * 一/为什么需要内部类？
 *      1.内部类能够更好的封装，内聚，屏蔽细节
 *      2.内部类天然有访问外部类成员变量的能力
 *
 * 二/为什么内部类（包括匿名内部类、局部内部类），会持有外部类的引用？
 *      1.查看字节码
 *      2.先通过new指令，新建了一个Demo$DemoRunnable对象
 *      3.aload_0指令将外部类Demo对象自身加载到栈帧中
 *      4.调用Demo$DemoRunnable类的init方法，注意这里将Demo对象作为了参数传递进来了
 *      * 综上，参数是作为参数传进来的
 *
 * 三/为何局部变量传递给匿名内部类需要是final?
 *      1.不需要局部一定是final，但是不能在匿名内部类中修改外部局部变量
 *      2.因为java匿名内部类传递变量的实现是基于构造器传参的，
 *          也就是说，如果允许你在内部类中改变值，会给程序员造成误解，
 *          认为你已经改边了局部变量的值，其实并没有。所以就禁用了。
 */
public class NormalDemo {

    private List<Job> jobList = new ArrayList<>();

    public void addJob(Runnable runnable) {
        jobList.add(new Job(runnable));
    }

    private class Job implements Runnable {

        private Runnable runnable;
        public Job(Runnable target) {
            this.runnable = target;
        }
        @Override
        public void run() {
            runnable.run();
            System.out.println("left job size : " + jobList.size());
        }
    }


    /**
     *<p>方法说明: 普通内部类</p>
     *<p>创建时间: 2:14 PM 2019/6/19</p>
     *<p>方法作者: huaxu</p>
     */
    public class RunnDiy implements Runnable {
        @Override
        public void run() {

        }
    }

    /**
     *<p>方法说明: 匿名内部类</p>
     *<p>创建时间: 2:14 PM 2019/6/19</p>
     *<p>方法作者: huaxu</p>
     */
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    };

    /**
     *<p>方法说明: 局部内部类</p>
     *<p>创建时间: 2:15 PM 2019/6/19</p>
     *<p>方法作者: huaxu</p>
     */
    public void work() {
        class InnerRunnable implements Runnable {
            @Override
            public void run() {

            }
        }
        InnerRunnable runnable = new InnerRunnable();
    }
}