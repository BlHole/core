package com.huaxu.core.designModel.acitonModel.state.demo1;

import com.huaxu.core.designModel.acitonModel.state.demo1.inter.ScoreContext;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 状态模式</p>
 * <p>创建日期: 2019/06/12 12:47</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        ScoreContext context = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        context.add(30);
        context.add(40);
        context.add(25);
        context.add(-15);
        context.add(-25);
    }
}