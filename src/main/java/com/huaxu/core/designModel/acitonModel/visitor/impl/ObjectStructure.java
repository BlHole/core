package com.huaxu.core.designModel.acitonModel.visitor.impl;

import com.huaxu.core.designModel.acitonModel.visitor.inter.Element;
import com.huaxu.core.designModel.acitonModel.visitor.inter.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while (i.hasNext()) {
            i.next().accept(visitor);
        }      
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}