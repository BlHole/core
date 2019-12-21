package com.huaxu.core.designModel.structModel.bridge.impl;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: HandBag</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/10 22:26</p>
 * <p>创建用户：huaxu</p>
 */
public class HandBag extends Bag{

    @Override
    public String getName() {
        return color.getColor()+" HandBag";
    }
}