package com.huaxu.core.designModel.createModel.abstractFactory.inter;

import com.huaxu.core.designModel.createModel.abstractFactory.model.Animal;
import com.huaxu.core.designModel.createModel.abstractFactory.model.Plant;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Farm</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/10 21:40</p>
 * <p>创建用户：huaxu</p>
 */
public interface Farm {
    Animal getAnimal();
    Plant getPlant();
}
