package com.huaxu.core.designModel.acitonModel.command.impl;


import com.huaxu.core.designModel.acitonModel.command.inter.Kitchen;
import com.huaxu.core.designModel.acitonModel.strategy.abstractClass.KitChen;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: ChangFenChef</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/11 21:15</p>
 * <p>创建用户：huaxu</p>
 */
public class ChangFenChef implements Kitchen {

    @Override
    public void adding() {
        System.out.println("肠粉厨师开始烹饪。。。。");
    }
}