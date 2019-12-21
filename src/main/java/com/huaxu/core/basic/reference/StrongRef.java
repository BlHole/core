package com.huaxu.core.basic.reference;


import com.huaxu.core.basic.reference.model.House;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: StrongRef</p>
 * <p>文件描述: </p>
 * <p>内容摘要: -Xms20m -Xmx20m -XX:+PrintGCDetails -XX:+PrintGCTimeStamps</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/09 13:07</p>
 * <p>创建用户：huaxu</p>
 */
public class StrongRef {

    public static void main(String[] args) {
        List<House> list = new ArrayList<>();

        int i=0;
        while(true){
            House house = new House();
            list.add(house);
            System.out.println("this is i="+i++);
        }
    }
}