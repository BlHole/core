package com.huaxu.core.designModel.acitonModel.observer.jdk;

import com.huaxu.core.designModel.acitonModel.observer.jdk.impl.Bear;
import com.huaxu.core.designModel.acitonModel.observer.jdk.impl.Bull;
import com.huaxu.core.designModel.acitonModel.observer.jdk.impl.OilFutures;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 观察者模式-jdk</p>
 * <p>创建日期: 2019/06/12 13:05</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        OilFutures oilFutures = new OilFutures();
        oilFutures.addObserver(new Bear());
        oilFutures.addObserver(new Bull());
        oilFutures.setPrice(5.20f);
    }
}