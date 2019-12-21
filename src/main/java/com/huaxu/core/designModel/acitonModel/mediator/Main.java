package com.huaxu.core.designModel.acitonModel.mediator;

import com.huaxu.core.designModel.acitonModel.mediator.impl.SimpleConcreteColleague1;
import com.huaxu.core.designModel.acitonModel.mediator.impl.SimpleConcreteColleague2;
import com.huaxu.core.designModel.acitonModel.mediator.inter.SimpleColleague;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 中介者模式</p>
 * <p>创建日期: 2019/06/12 15:30</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        SimpleColleague c1,c2;
        c1 = new SimpleConcreteColleague1();
        c2 = new SimpleConcreteColleague2();
        c1.send();
        System.out.println("-----------------");
        c2.send();
    }
}