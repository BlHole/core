package com.huaxu.core.designModel.acitonModel.state.demo1.inter;

import com.huaxu.core.designModel.acitonModel.state.demo1.impl.LowState;

public class ScoreContext {
    private AbstractState state;

    public ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score) {
        state.addScore(score);
    }
}