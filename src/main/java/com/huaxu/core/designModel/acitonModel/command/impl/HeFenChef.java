package com.huaxu.core.designModel.acitonModel.command.impl;

import com.huaxu.core.designModel.acitonModel.command.inter.Kitchen;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: HeFenChef</p>
 * <p>创建日期: 2019/06/11 21:28</p>
 * <p>创建用户：huaxu</p>
 */
public class HeFenChef implements Kitchen {

    @Override
    public void adding() {
        System.out.println("河粉师傅开始炒河粉了。。。");
    }
}