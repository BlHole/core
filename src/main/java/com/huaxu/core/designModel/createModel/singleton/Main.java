package com.huaxu.core.designModel.createModel.singleton;

import com.huaxu.core.designModel.createModel.singleton.type.LazySingleton;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: 单例模式</p>
 * <p>创建日期: 2019/06/07 22:11</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("同一个对象");
        } else {
            System.out.println("不是同一个");
        }
    }
}