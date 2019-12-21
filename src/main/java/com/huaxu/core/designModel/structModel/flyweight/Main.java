package com.huaxu.core.designModel.structModel.flyweight;

import com.huaxu.core.designModel.structModel.flyweight.impl.FlyweightFactory;
import com.huaxu.core.designModel.structModel.flyweight.inter.Flyweight;
import com.huaxu.core.designModel.structModel.flyweight.model.UnsharedConcreteFlyweight;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 享元模式</p>
 * <p>创建日期: 2019/06/10 22:47</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight f01=factory.getFlyweight("a");
        Flyweight f02=factory.getFlyweight("a");
        Flyweight f03=factory.getFlyweight("a");
        Flyweight f11=factory.getFlyweight("b");
        Flyweight f12=factory.getFlyweight("b");
        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
    }
}