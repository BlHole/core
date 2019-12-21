package com.huaxu.core.designModel.acitonModel.state.demo1.impl;

import com.huaxu.core.designModel.acitonModel.state.demo1.inter.AbstractState;
import com.huaxu.core.designModel.acitonModel.state.demo1.inter.ScoreContext;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: LowState</p>
 * <p>文件描述: 不及格</p>
 * <p>创建日期: 2019/06/12 12:48</p>
 * <p>创建用户：huaxu</p>
 */
public class LowState extends AbstractState {

    public LowState(ScoreContext h) {
        hj = h;
        stateName = "不及格";
        score = 0;
    }
    public LowState(AbstractState state) {
        hj = state.hj;
        stateName = "不及格";
        score = state.score;
    }

    @Override
    public void checkState() {
        if(score>=90) {
            hj.setState(new HighState(this));
        }
        else if(score>=60) {
            hj.setState(new MiddleState(this));
        }
    }
}