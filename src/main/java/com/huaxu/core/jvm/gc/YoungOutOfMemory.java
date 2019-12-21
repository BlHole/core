package com.huaxu.core.jvm.gc;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: YoungOutOfMemory</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/07 14:10</p>
 * <p>创建用户：huaxu</p>
 */
public class YoungOutOfMemory {

    /**
     *  @Date: 2:13 PM 2019/8/7
     *  @Author: huaxu
     *  @Description:
     *        VM参数：  -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold
     */
    public static void main(String[] args) {
        Byte[] a, b ,c, d;
        a = new Byte[3 *128*1024];
        b = new Byte[3 *128*1024];
        c = new Byte[3 *128*1024];
        d = new Byte[3 *128*1024];
    }
}