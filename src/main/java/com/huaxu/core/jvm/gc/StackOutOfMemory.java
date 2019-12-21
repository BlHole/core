package com.huaxu.core.jvm.gc;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: StackOutOfMemory</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/07 14:11</p>
 * <p>创建用户：huaxu</p>
 */
public class StackOutOfMemory {

    public static void main(String[] args) {
        new StackOutOfMemory().whileTest();
    }
    public void whileTest(){
        whileTest();
    }
}