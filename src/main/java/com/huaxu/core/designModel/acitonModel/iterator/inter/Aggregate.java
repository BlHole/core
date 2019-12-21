package com.huaxu.core.designModel.acitonModel.iterator.inter;

public interface Aggregate {
    public void add(Object obj); 
    public void remove(Object obj); 
    public Iterator getIterator(); 
}