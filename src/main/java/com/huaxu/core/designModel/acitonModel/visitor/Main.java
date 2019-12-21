package com.huaxu.core.designModel.acitonModel.visitor;

import com.huaxu.core.designModel.acitonModel.visitor.impl.*;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 访问者模式</p>
 * <p>创建日期: 2019/06/13 10:19</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());

        os.accept(new ConcreteVisitorA());
        System.out.println("------------------------");
        os.accept(new ConcreteVisitorB());
    }
}