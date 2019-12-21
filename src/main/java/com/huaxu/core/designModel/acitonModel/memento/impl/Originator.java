package com.huaxu.core.designModel.acitonModel.memento.impl;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state=state; 
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state); 
    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState()); 
    } 
}