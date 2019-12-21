package com.huaxu.core.designModel.acitonModel.observer.jdk.impl;

import java.util.Observable;
import java.util.Observer;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Bull</p>
 * <p>文件描述: 多方</p>
 * <p>创建日期: 2019/06/12 13:07</p>
 * <p>创建用户：huaxu</p>
 */
public class Bull implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Float price=((Float)arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨"+price+"元，多方高兴了！");
        } else {
            System.out.println("油价下跌"+(-price)+"元，多方伤心了！");
        }
    }
}