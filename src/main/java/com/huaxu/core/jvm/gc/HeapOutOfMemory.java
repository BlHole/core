package com.huaxu.core.jvm.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: HeapOutOfMemory</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/07 14:10</p>
 * <p>创建用户：huaxu</p>
 */
public class HeapOutOfMemory {

    /**
     *  @Date: 2:13 PM 2019/8/7
     *  @Author: huaxu
     *  @Description:
     *        VM参数：  -Xms5M -Xmx5M
     */
    public static void main(String[] args) {
        List<Byte[]> list = new ArrayList<>();
        list.add(new Byte[10 *128*1024]); //10M
    }
}