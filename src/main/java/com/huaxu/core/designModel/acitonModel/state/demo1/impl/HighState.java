package com.huaxu.core.designModel.acitonModel.state.demo1.impl;

import com.huaxu.core.designModel.acitonModel.state.demo1.inter.AbstractState;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: HighState</p>
 * <p>文件描述: 优秀</p>
 * <p>创建日期: 2019/06/12 12:48</p>
 * <p>创建用户：huaxu</p>
 */
public class HighState extends AbstractState {


    public HighState(AbstractState state) {
        hj = state.hj;
        stateName = "优秀";
        score = state.score;
    }

    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score < 90) {
            hj.setState(new MiddleState(this));
        }
    }
}