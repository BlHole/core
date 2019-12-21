package com.huaxu.core.designModel.structModel.flyweight.impl;

import com.huaxu.core.designModel.structModel.flyweight.inter.Flyweight;

import java.util.HashMap;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: FlyweightFactory</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/10 23:02</p>
 * <p>创建用户：huaxu</p>
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights=new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元"+key+"已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}