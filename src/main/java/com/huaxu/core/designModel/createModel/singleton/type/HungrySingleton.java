package com.huaxu.core.designModel.createModel.singleton.type;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: HungrySingleton</p>
 * <p>创建日期: 2019/06/07 22:16</p>
 * <p>创建用户：huaxu</p>
 */
public class HungrySingleton {

    private static volatile HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}