package com.huaxu.core.jvm.initClass;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: HeadNative</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/04/29 10:55</p>
 * <p>创建用户：huaxu</p>
 */
public class HeadNative {

    public static final String navite = "aa";

    public static void main(String[] args) {
        String value = new String("aa");
        String intern = value.intern();

        System.out.println(value == intern);
        System.out.println(intern == navite);
    }

}