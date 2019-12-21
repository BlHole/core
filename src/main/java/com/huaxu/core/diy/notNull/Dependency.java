package com.huaxu.core.diy.notNull;

public class Dependency implements DependencyBase, Nullable {

    @Override
    public void Operation() {
        System.out.print("Huaxu!");
    }

    @Override
    public boolean isNull() {
        return false;
    }
}