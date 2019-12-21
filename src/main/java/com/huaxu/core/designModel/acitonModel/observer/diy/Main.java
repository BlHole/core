package com.huaxu.core.designModel.acitonModel.observer.diy;

import com.huaxu.core.designModel.acitonModel.observer.diy.impl.BellEventSource;
import com.huaxu.core.designModel.acitonModel.observer.diy.impl.StuEventListener;
import com.huaxu.core.designModel.acitonModel.observer.diy.impl.TeachEventListener;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 观察者模式自定义</p>
 * <p>创建日期: 2019/06/12 13:14</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        BellEventSource eventSource = new BellEventSource();
        eventSource.addPersonListener(new TeachEventListener());
        eventSource.addPersonListener(new StuEventListener());

        eventSource.ring(true);
        System.out.println("----------------");
        eventSource.ring(false);
    }
}