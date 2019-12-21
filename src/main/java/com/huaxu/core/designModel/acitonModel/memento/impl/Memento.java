package com.huaxu.core.designModel.acitonModel.memento.impl;

// 备忘录
public class Memento {
    private String state;

    public Memento(String state) {
        this.state=state; 
    }

    public void setState(String state) {
        this.state=state; 
    }

    public String getState() {
        return state; 
    }
}