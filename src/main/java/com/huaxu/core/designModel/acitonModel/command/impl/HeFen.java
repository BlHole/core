package com.huaxu.core.designModel.acitonModel.command.impl;

import com.huaxu.core.designModel.acitonModel.command.inter.Breakfast;
import com.huaxu.core.designModel.acitonModel.command.inter.Kitchen;

public class HeFen implements Breakfast {
    private Kitchen receiver;
    public HeFen() {
        receiver=new HeFenChef();

    }
    public void cooking() {
        receiver.adding();
    }
}