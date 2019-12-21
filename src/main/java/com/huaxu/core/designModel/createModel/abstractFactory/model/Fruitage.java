package com.huaxu.core.designModel.createModel.abstractFactory.model;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Fruitage</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/10 21:49</p>
 * <p>创建用户：huaxu</p>
 */
public class Fruitage implements Plant{

    @Override
    public void show() {
        System.out.println("水果好吃，新鲜");
    }
}