package com.huaxu.core.designModel.createModel.singleton.type;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: DoubleCheckSingleton</p>
 * <p>创建日期: 2019/06/07 22:18</p>
 * <p>创建用户：huaxu</p>
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance = null;
    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}