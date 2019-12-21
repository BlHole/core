package com.huaxu.core.designModel.structModel.bridge;

import com.huaxu.core.designModel.structModel.bridge.impl.Bag;
import com.huaxu.core.designModel.structModel.bridge.inter.Yellow;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 桥接模式</p>
 * <p>创建日期: 2019/06/10 22:20</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        String clazz = "com.huaxu.core.designModel.structModel.bridge.impl.HandBag";
        String clazz = "com.huaxu.core.designModel.structModel.bridge.impl.Wallet";
        Bag bag = (Bag) Class.forName(clazz).newInstance();
//        bag.SetColor(new Red());
        bag.SetColor(new Yellow());
        System.out.println(bag.getName());
    }
}