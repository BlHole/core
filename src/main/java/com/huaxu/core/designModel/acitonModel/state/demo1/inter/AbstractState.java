package com.huaxu.core.designModel.acitonModel.state.demo1.inter;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: AbstractState</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/12 12:47</p>
 * <p>创建用户：huaxu</p>
 */
public abstract class AbstractState {

    public ScoreContext hj;  //环境
    public String stateName; //状态名
    public int score; //分数
    public abstract void checkState(); //检查当前状态

    public void addScore(int x) {
        score += x;
        System.out.print("加上："+x+"分，\t当前分数："+score );
        checkState();
        System.out.println("分，\t当前状态："+hj.getState().stateName);
    }
}