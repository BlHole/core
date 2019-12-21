package com.huaxu.core.basic.reference;

import com.huaxu.core.basic.reference.model.House;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: StrongRef</p>
 * <p>其他说明: -Xms20m -Xmx20m -XX:+PrintGCDetails -XX:+PrintGCTimeStamps</p>
 * <p>创建日期: 2019/06/09 13:07</p>
 * <p>创建用户：huaxu</p>
 */
public class SoftRef {

    public static void main(String[] args) {
        List<SoftReference> houses = new ArrayList<>();

        int i=0;
        while (true) {
            SoftReference<House> softReference = new SoftReference<>(new House());
            houses.add(softReference);
            System.out.println("this is i=" + i++);
        }
    }
}