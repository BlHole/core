package com.huaxu.core.designModel.acitonModel.command.impl;

import com.huaxu.core.designModel.acitonModel.command.inter.Breakfast;

public class Waiter {
    private Breakfast changFen,hunTun,heFen;
    public void setChangFen(Breakfast f) {
        changFen=f;
    }
    public void setHunTun(Breakfast f) {
        hunTun=f;
    }
    public void setHeFen(Breakfast f) {
        heFen=f;
    }
    public void chooseChangFen() {
        changFen.cooking();
    }
    public void chooseHunTun() {
        hunTun.cooking();
    }
    public void chooseHeFen() {
        heFen.cooking();
    }
}