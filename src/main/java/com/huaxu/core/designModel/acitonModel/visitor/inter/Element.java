package com.huaxu.core.designModel.acitonModel.visitor.inter;

//抽象元素类
public interface Element {
    void accept(Visitor visitor);
}