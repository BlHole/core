package com.huaxu.core.designModel.createModel.singleton.type;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: LazySingleton</p>
 * <p>创建日期: 2019/06/07 22:12</p>
 * <p>创建用户：huaxu</p>
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;
    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}