package com.huaxu.core.designModel.structModel.composite.impl;

import com.huaxu.core.designModel.structModel.composite.inter.Articles;

import java.util.ArrayList;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Bags</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/10 23:21</p>
 * <p>创建用户：huaxu</p>
 */
public class Bags implements Articles {
    private String name;     //名字
    private ArrayList<Articles> bags=new ArrayList<Articles>();

    public Bags(String name) {
        this.name=name;
    }

    public void add(Articles c) {
        bags.add(c);
    }

    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s=0;
        for (Articles bag : bags) {
            s+=bag.calculation();
        }
        return s;
    }

    @Override
    public void show() {
        System.out.println("---名字----"+name+"-----");
        for (Articles bag : bags) {
            bag.show();
        }
    }
}