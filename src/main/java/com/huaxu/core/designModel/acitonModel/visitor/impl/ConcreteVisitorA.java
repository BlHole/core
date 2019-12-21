package com.huaxu.core.designModel.acitonModel.visitor.impl;

import com.huaxu.core.designModel.acitonModel.visitor.inter.Visitor;

//具体访问者A类
public class ConcreteVisitorA implements Visitor {

    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->"+element.operationA());
    }

    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->"+element.operationB());
    }
}