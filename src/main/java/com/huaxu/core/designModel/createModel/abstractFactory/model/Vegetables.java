package com.huaxu.core.designModel.createModel.abstractFactory.model;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Vegetables</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/10 21:45</p>
 * <p>创建用户：huaxu</p>
 */
public class Vegetables implements Plant{

    @Override
    public void show() {
        System.out.println("蔬菜 新鲜 不含添加素");
    }
}