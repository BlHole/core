package com.huaxu.core.basic.reference;


import com.huaxu.core.basic.reference.model.House;

import java.util.WeakHashMap;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: StrongRef</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/09 13:07</p>
 * <p>创建用户：huaxu</p>
 */
public class WeakRef {

    public static void main(String[] args) {
        House houseOne = new House();
        Object objectOne = new Object();

        House houseTwo = new House();
        Object objectTwo = new Object();
        WeakHashMap<House, Object> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(houseOne, objectOne);
        weakHashMap.put(houseTwo, objectTwo);

        System.out.println("weakHashMap size is " + weakHashMap.size());
        houseOne = null;
        System.gc();
        System.runFinalization();

        System.out.println("weakHashMap size is " + weakHashMap.size());
        System.out.println(weakHashMap.toString());
    }
}