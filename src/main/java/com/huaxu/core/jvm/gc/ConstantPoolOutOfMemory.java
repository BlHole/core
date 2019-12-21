package com.huaxu.core.jvm.gc;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: ConstantPoolOutOfMemory</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/07 14:11</p>
 * <p>创建用户：huaxu</p>
 */
public class ConstantPoolOutOfMemory {

    private final static Byte[] byte1 = new Byte[1024*1024*1024];
    private final static Byte[] byte2 = new Byte[1024*1024*1024];
    private final static Byte[] byte3 = new Byte[1024*1024*1024];
    private final static Byte[] byte4 = new Byte[1024*1024*1024];
    private final static Byte[] byte5 = new Byte[1024*1024*1024];

    public static void main(String[] args) {}
}