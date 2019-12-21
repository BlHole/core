package com.huaxu.core.designModel.acitonModel.memento;

import com.huaxu.core.designModel.acitonModel.memento.impl.Caretaker;
import com.huaxu.core.designModel.acitonModel.memento.impl.Originator;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 备忘录模式</p>
 * <p>创建日期: 2019/06/13 10:26</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        Originator or = new Originator();
        Caretaker cr = new Caretaker();

        or.setState("S0");
        System.out.println("初始状态:"+or.getState());
        cr.setMemento(or.createMemento()); //保存状态

        or.setState("S1");
        System.out.println("新的状态:"+or.getState());
        or.restoreMemento(cr.getMemento()); //恢复状态

        System.out.println("恢复状态:"+or.getState());
    }
}