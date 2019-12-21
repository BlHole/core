package com.huaxu.core.designModel.structModel.flyweight.model;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: UnsharedConcreteFlyweight</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/10 22:59</p>
 * <p>创建用户：huaxu</p>
 */
public class UnsharedConcreteFlyweight {
    private String info;

    public String getInfo() {
        return info;
    }

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
}