package com.huaxu.core.designModel.acitonModel.chainOfResponsibility.inter;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Leader</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/12 10:01</p>
 * <p>创建用户：huaxu</p>
 */
public abstract class Leader {

    private Leader next;
    public void setNext(Leader next) {
        this.next = next;
    }

    public Leader getNext(){
        return next;
    }

    //处理请求的方法
    public abstract void handleRequest(int LeaveDays);
}