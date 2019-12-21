package com.huaxu.core.diy.notNull;

public class NullObject implements DependencyBase{

    @Override
    public void Operation() {
    }
    @Override
    public boolean isNull() {
        return true;
    }
    
}