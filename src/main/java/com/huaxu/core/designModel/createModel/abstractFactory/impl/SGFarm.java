package com.huaxu.core.designModel.createModel.abstractFactory.impl;

import com.huaxu.core.designModel.createModel.abstractFactory.inter.Farm;
import com.huaxu.core.designModel.createModel.abstractFactory.model.Animal;
import com.huaxu.core.designModel.createModel.abstractFactory.model.Cattle;
import com.huaxu.core.designModel.createModel.abstractFactory.model.Plant;
import com.huaxu.core.designModel.createModel.abstractFactory.model.Vegetables;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: SGFarm</p>
 * <p>文件描述: 具体工厂-韶关农场类</p>
 * <p>创建日期: 2019/06/10 21:35</p>
 * <p>创建用户：huaxu</p>
 */
public class SGFarm implements Farm {

    @Override
    public Animal getAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }

    @Override
    public Plant getPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}