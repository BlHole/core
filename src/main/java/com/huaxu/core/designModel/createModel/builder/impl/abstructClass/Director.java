package com.huaxu.core.designModel.createModel.builder.impl.abstructClass;

import com.huaxu.core.designModel.createModel.builder.impl.Product;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Director</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/08 10:24</p>
 * <p>创建用户：huaxu</p>
 */
public class Director {

    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}