package com.huaxu.core.designModel.createModel.abstractFactory.impl;

import com.huaxu.core.designModel.createModel.abstractFactory.inter.Farm;
import com.huaxu.core.designModel.createModel.abstractFactory.model.Animal;
import com.huaxu.core.designModel.createModel.abstractFactory.model.Fruitage;
import com.huaxu.core.designModel.createModel.abstractFactory.model.House;
import com.huaxu.core.designModel.createModel.abstractFactory.model.Plant;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: SRFarm</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/10 21:48</p>
 * <p>创建用户：huaxu</p>
 */
public class SRFarm implements Farm {

    @Override
    public Animal getAnimal() {
        System.out.println("新马出生！");
        return new House();
    }

    @Override
    public Plant getPlant() {
        System.out.println("水果长成！");
        return new Fruitage();
    }
}