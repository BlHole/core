package com.huaxu.core.designModel.structModel.adapter;

import com.huaxu.core.designModel.structModel.adapter.inter.Motor;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 适配器模式</p>
 * <p>创建日期: 2019/06/10 22:08</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println("适配器模式测试：");
//        String clazz = "com.huaxu.core.designModel.structModel.adapter.impl.OpticalAdapter";
        String clazz = "com.huaxu.core.designModel.structModel.adapter.impl.ElectricAdapter";
        Motor motor = (Motor) Class.forName(clazz).newInstance();
        motor.drive();
    }
}