package com.huaxu.core.designModel.acitonModel.iterator.impl;

import com.huaxu.core.designModel.acitonModel.iterator.inter.Iterator;

import java.util.List;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: ConcreteIterator</p>
 * <p>文件描述: 具体迭代器</p>
 * <p>创建日期: 2019/06/13 10:01</p>
 * <p>创建用户：huaxu</p>
 */
public class ConcreteIterator implements Iterator {

    private List<Object> list = null;
    private int index=-1;
    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()-1) {
            return true;
        }
        return false;
    }
}