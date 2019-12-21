package com.huaxu.core.designModel.createModel.abstractFactory.model;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Cattle</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/10 21:45</p>
 * <p>创建用户：huaxu</p>
 */
public class Cattle implements Animal{

    @Override
    public void show() {
        System.out.println("奶牛木木木木");
    }
}