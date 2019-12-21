package com.huaxu.core.diy.notNull;

public class Factory {
    
    public static DependencyBase get(Nullable dependencyBase){
        if (dependencyBase == null){
            return new NullObject();
        }
        return new Dependency();
    }
    
}