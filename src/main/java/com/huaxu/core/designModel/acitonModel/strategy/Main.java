package com.huaxu.core.designModel.acitonModel.strategy;

import com.huaxu.core.designModel.acitonModel.strategy.ImpClass.Bread;
import com.huaxu.core.designModel.acitonModel.strategy.ImpClass.Cake;
import com.huaxu.core.designModel.acitonModel.strategy.abstractClass.KitChen;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: 策略模式</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/17 22:15</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        new KitChen(new Bread()).cooking();
        new KitChen(new Cake()).cooking();
    }
}