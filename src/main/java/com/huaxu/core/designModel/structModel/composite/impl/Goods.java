package com.huaxu.core.designModel.structModel.composite.impl;

import com.huaxu.core.designModel.structModel.composite.inter.Articles;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Goods</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/10 23:20</p>
 * <p>创建用户：huaxu</p>
 */
public class Goods implements Articles {
    private String name;     //名字
    private int quantity;    //数量
    private float unitPrice; //单价
    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return quantity*unitPrice;
    }

    @Override
    public void show() {
        System.out.println(name+"(数量："+quantity+"，单价："+unitPrice+"元)");
    }
}