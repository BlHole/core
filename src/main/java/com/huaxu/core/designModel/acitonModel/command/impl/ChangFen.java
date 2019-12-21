package com.huaxu.core.designModel.acitonModel.command.impl;

import com.huaxu.core.designModel.acitonModel.command.inter.Breakfast;
import com.huaxu.core.designModel.acitonModel.command.inter.Kitchen;

public class ChangFen implements Breakfast {

    private Kitchen receiver;

    public ChangFen(){
        receiver = new ChangFenChef();
    }

    public void cooking() {
        receiver.adding();
    }
}