package com.huaxu.core.designModel.acitonModel.iterator;

import com.huaxu.core.designModel.acitonModel.iterator.impl.ConcreteAggregate;
import com.huaxu.core.designModel.acitonModel.iterator.inter.Aggregate;
import com.huaxu.core.designModel.acitonModel.iterator.inter.Iterator;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 迭代器模式</p>
 * <p>创建日期: 2019/06/13 09:57</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("南方科技");

        System.out.print("聚合的内容有：");
        Iterator it = ag.getIterator();

        while(it.hasNext()) {
            Object ob=it.next();
            System.out.print(ob.toString()+"\t");
        }
        Object ob=it.first();
        System.out.println("\nFirst："+ob.toString());
    }
}