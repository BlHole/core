package com.huaxu.core.designModel.acitonModel.mediator.impl;

import com.huaxu.core.designModel.acitonModel.mediator.inter.SimpleColleague;

import java.util.ArrayList;
import java.util.List;

class SimpleMediator
{
    private static SimpleMediator smd = new SimpleMediator();
    private List<SimpleColleague> colleagues = new ArrayList<SimpleColleague>();
    private SimpleMediator(){}

    public static SimpleMediator getMedium() {
        return smd;
    }

    public void register(SimpleColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }


    public void relay(SimpleColleague scl) {
        for (SimpleColleague ob:colleagues) {
            if(!ob.equals(scl)) {
                ob.receive();
            }   
        }
    }
}