package com.huaxu.core.designModel.acitonModel.chainOfResponsibility.impl;

import com.huaxu.core.designModel.acitonModel.chainOfResponsibility.inter.Leader;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: DeanOfStudies</p>
 * <p>文件描述: 教务处长</p>
 * <p>创建日期: 2019/06/12 10:13</p>
 * <p>创建用户：huaxu</p>
 */
public class DeanOfStudies extends Leader {

    @Override
    public void handleRequest(int LeaveDays) {
        if (LeaveDays<=20) {
            System.out.println("教务处长批准您请假" + LeaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}