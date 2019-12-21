package com.huaxu.core.designModel.acitonModel.observer.jdk.impl;

import java.util.Observable;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: OilFutures</p>
 * <p>文件描述: 原油期货</p>
 * <p>创建日期: 2019/06/12 13:06</p>
 * <p>创建用户：huaxu</p>
 */
public class OilFutures extends Observable {

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        super.setChanged() ;            //设置内部标志位，注明数据发生变化
        super.notifyObservers(price);   //通知观察者价格改变了
        this.price = price;
    }
}