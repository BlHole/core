package com.huaxu.core.designModel.acitonModel.state.demo2;

import com.huaxu.core.designModel.acitonModel.state.demo2.impl.Context;
import com.huaxu.core.designModel.acitonModel.state.demo2.inter.StartState;
import com.huaxu.core.designModel.acitonModel.state.demo2.inter.StopState;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/21 11:00</p>
 * <p>author：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}