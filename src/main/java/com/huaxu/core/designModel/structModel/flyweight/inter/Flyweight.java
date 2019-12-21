package com.huaxu.core.designModel.structModel.flyweight.inter;

import com.huaxu.core.designModel.structModel.flyweight.model.UnsharedConcreteFlyweight;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Flyweight</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/10 22:58</p>
 * <p>创建用户：huaxu</p>
 */
public interface Flyweight {
    void operation(UnsharedConcreteFlyweight state);
}
