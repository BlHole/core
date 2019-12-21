package com.huaxu.core.designModel.acitonModel.visitor.impl;

import com.huaxu.core.designModel.acitonModel.visitor.inter.Element;
import com.huaxu.core.designModel.acitonModel.visitor.inter.Visitor;

public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作。";
    }
}