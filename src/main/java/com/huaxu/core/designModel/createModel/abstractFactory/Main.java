package com.huaxu.core.designModel.createModel.abstractFactory;

import com.huaxu.core.designModel.createModel.abstractFactory.inter.Farm;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 抽象工厂</p>
 * <p>创建日期: 2019/06/10 21:32</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        String clazz = "com.huaxu.core.designModel.createModel.abstractFactory.impl.SGFarm";
        String clazz = "com.huaxu.core.designModel.createModel.abstractFactory.impl.SRFarm";
        Farm farm = (Farm) Class.forName(clazz).newInstance();
        farm.getAnimal().show();
        farm.getPlant().show();
    }
}