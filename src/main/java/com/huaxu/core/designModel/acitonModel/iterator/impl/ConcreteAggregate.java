package com.huaxu.core.designModel.acitonModel.iterator.impl;

import com.huaxu.core.designModel.acitonModel.iterator.inter.Aggregate;
import com.huaxu.core.designModel.acitonModel.iterator.inter.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<Object>();

    public void add(Object obj) {
        list.add(obj); 
    }

    public void remove(Object obj) {
        list.remove(obj); 
    }

    public Iterator getIterator() {
        return(new ConcreteIterator(list)); 
    }     
}