package com.huaxu.core.designModel.createModel.builder.impl.abstructClass;

import com.huaxu.core.designModel.createModel.builder.impl.Product;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Builder</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/08 10:15</p>
 * <p>创建用户：huaxu</p>
 */
public abstract class Builder {

    public Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult(){
        return product;
    }
}