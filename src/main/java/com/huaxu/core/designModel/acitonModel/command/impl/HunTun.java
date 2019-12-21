package com.huaxu.core.designModel.acitonModel.command.impl;

import com.huaxu.core.designModel.acitonModel.command.inter.Breakfast;
import com.huaxu.core.designModel.acitonModel.command.inter.Kitchen;

public class HunTun implements Breakfast {
    private Kitchen receiver;
    public HunTun() {
        receiver=new HunTunChef();
    }
    public void cooking() {
        receiver.adding();
    }
}