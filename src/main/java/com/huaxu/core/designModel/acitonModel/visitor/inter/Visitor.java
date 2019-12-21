package com.huaxu.core.designModel.acitonModel.visitor.inter;

import com.huaxu.core.designModel.acitonModel.visitor.impl.ConcreteElementA;
import com.huaxu.core.designModel.acitonModel.visitor.impl.ConcreteElementB;

public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}