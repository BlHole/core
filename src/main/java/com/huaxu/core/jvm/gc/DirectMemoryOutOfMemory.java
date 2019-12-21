package com.huaxu.core.jvm.gc;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: DirectMemoryOutOfMemory</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/07 14:11</p>
 * <p>创建用户：huaxu</p>
 */
public class DirectMemoryOutOfMemory {

    public static void main(String[] args) throws Exception{
        List<ByteBuffer> buffers = new ArrayList<>();
        while(true){
            ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024);
            buffers.add(buffer);
        }
    }
}