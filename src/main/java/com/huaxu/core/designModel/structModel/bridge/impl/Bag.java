package com.huaxu.core.designModel.structModel.bridge.impl;

import com.huaxu.core.designModel.structModel.bridge.inter.Color;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Bag</p>
 * <p>文件描述: 抽象化角色-包</p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/10 22:24</p>
 * <p>创建用户：huaxu</p>
 */
public abstract class Bag {

    Color color;
    public void SetColor(Color color) {
        this.color = color;
    }

    public abstract String getName();
}