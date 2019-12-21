package com.huaxu.core.designModel.createModel.factoryFunction;

import com.huaxu.core.designModel.createModel.factoryFunction.abstractClass.Animal;
import com.huaxu.core.designModel.createModel.factoryFunction.abstractClass.CoreFactory;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: 工厂方法</p>
 * <p>创建日期: 2019/05/17 21:26</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static final String className = "com.huaxu.core.designModel.createModel.factoryFunction.ImplClass.HouseFactory";
//    public staticProxy final String className = "com.huaxu.core.designModel.createModel.factoryFunction.ImplClass.CowFactory";

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(className);
        CoreFactory factory = (CoreFactory) aClass.newInstance();
        Animal animal = factory.productAnimal();
        animal.show();
    }
}