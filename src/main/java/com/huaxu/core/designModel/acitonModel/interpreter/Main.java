package com.huaxu.core.designModel.acitonModel.interpreter;

import com.huaxu.core.designModel.acitonModel.interpreter.impl.Context;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 解释器</p>
 * <p>创建日期: 2019/06/13 10:34</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }
}