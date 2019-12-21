package com.huaxu.core.designModel.acitonModel.chainOfResponsibility;

import com.huaxu.core.designModel.acitonModel.chainOfResponsibility.impl.ClassAdviser;
import com.huaxu.core.designModel.acitonModel.chainOfResponsibility.impl.Dean;
import com.huaxu.core.designModel.acitonModel.chainOfResponsibility.impl.DeanOfStudies;
import com.huaxu.core.designModel.acitonModel.chainOfResponsibility.impl.DepartmentHead;
import com.huaxu.core.designModel.acitonModel.chainOfResponsibility.inter.Leader;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 责任链模式</p>
 * <p>创建日期: 2019/06/12 10:00</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        //组装责任链
        Leader teacher1=new ClassAdviser();
        Leader teacher2=new DepartmentHead();
        Leader teacher3=new Dean();
        Leader teacher4=new DeanOfStudies();
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        teacher3.setNext(teacher4);
        //提交请求
        teacher1.handleRequest(2);
    }
}