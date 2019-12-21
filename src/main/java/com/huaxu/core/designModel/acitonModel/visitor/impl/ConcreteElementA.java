package com.huaxu.core.designModel.acitonModel.visitor.impl;

import com.huaxu.core.designModel.acitonModel.visitor.inter.Element;
import com.huaxu.core.designModel.acitonModel.visitor.inter.Visitor;

public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作。";
    }
}