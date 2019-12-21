package com.huaxu.core.designModel.acitonModel.memento.impl;

public class Caretaker {
    private Memento memento;

    public void setMemento(Memento m) {
        memento = m;
    }

    public Memento getMemento() {
        return memento; 
    }
}