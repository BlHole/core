package com.huaxu.core.designModel.createModel.factoryFunction.ImplClass;

import com.huaxu.core.designModel.createModel.factoryFunction.abstractClass.Animal;
import com.huaxu.core.designModel.createModel.factoryFunction.abstractClass.CoreFactory;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: CowFactory</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/17 21:30</p>
 * <p>创建用户：huaxu</p>
 */
public class CowFactory implements CoreFactory {

    @Override
    public Animal productAnimal() {
        System.out.println("牛工厂生成牛");
        return new Cow();
    }
}