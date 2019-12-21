package com.huaxu.core.designModel.structModel.flyweight.impl;

import com.huaxu.core.designModel.structModel.flyweight.inter.Flyweight;
import com.huaxu.core.designModel.structModel.flyweight.model.UnsharedConcreteFlyweight;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: ConcreteFlyweight</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/10 23:00</p>
 * <p>创建用户：huaxu</p>
 */
public class ConcreteFlyweight implements Flyweight {
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元"+key+"被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + state.getInfo());
    }
}