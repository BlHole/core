package com.huaxu.core.designModel.acitonModel.observer.diy.impl;

import com.huaxu.core.designModel.acitonModel.observer.diy.inter.BellEventListener;
import com.huaxu.core.designModel.acitonModel.observer.diy.inter.RingEvent;

public class TeachEventListener implements BellEventListener {

    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println("老师上课了...");           
        } else {
            System.out.println("老师下课了...");   
        }          
    }
}