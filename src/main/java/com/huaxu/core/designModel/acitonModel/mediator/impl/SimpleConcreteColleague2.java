package com.huaxu.core.designModel.acitonModel.mediator.impl;

import com.huaxu.core.designModel.acitonModel.mediator.inter.SimpleColleague;

public class SimpleConcreteColleague2 implements SimpleColleague {
    public SimpleConcreteColleague2(){
        SimpleMediator smd=SimpleMediator.getMedium();
        smd.register(this);
    }

    public void receive() {
        System.out.println("具体同事类2：收到请求。");
    }

    public void send() {
        SimpleMediator smd = SimpleMediator.getMedium();
        System.out.println("具体同事类2：发出请求...");
        smd.relay(this);
    }
}