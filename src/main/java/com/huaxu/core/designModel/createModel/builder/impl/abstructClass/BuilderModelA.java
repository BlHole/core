package com.huaxu.core.designModel.createModel.builder.impl.abstructClass;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: BuilderModelA</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/08 10:19</p>
 * <p>创建用户：huaxu</p>
 */
public class BuilderModelA extends Builder{

    @Override
    public void buildPartA() {
        product.setPartA("modelA---构建模型A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("modelA---构建模型B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("modelA---构建模型C");
    }
}