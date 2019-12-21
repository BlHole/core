package com.huaxu.core.designModel.acitonModel.chainOfResponsibility.impl;

import com.huaxu.core.designModel.acitonModel.chainOfResponsibility.inter.Leader;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Dean</p>
 * <p>文件描述: 院长</p>
 * <p>创建日期: 2019/06/12 10:12</p>
 * <p>创建用户：huaxu</p>
 */
public class Dean extends Leader {

    @Override
    public void handleRequest(int LeaveDays) {
        if (LeaveDays<=10) {
            System.out.println("院长批准您请假" + LeaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}