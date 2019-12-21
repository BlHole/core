package com.huaxu.core.designModel.acitonModel.mediator.impl;

import com.huaxu.core.designModel.acitonModel.mediator.inter.SimpleColleague;

public class SimpleConcreteColleague1 implements SimpleColleague {

    public SimpleConcreteColleague1(){
        SimpleMediator smd = SimpleMediator.getMedium();
        smd.register(this);
    }

    public void receive() {
        System.out.println("具体同事类1：收到请求。");
    }

    public void send() {
        SimpleMediator smd = SimpleMediator.getMedium();
        System.out.println("具体同事类1：发出请求...");
        smd.relay(this);
    }
}