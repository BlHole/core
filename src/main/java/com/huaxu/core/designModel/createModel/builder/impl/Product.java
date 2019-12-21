package com.huaxu.core.designModel.createModel.builder.impl;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Product</p>
 * <p>文件描述: 产品</p>
 * <p>创建日期: 2019/06/08 10:10</p>
 * <p>创建用户：huaxu</p>
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }


    public void show() {
        String message =  "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';

        System.out.println(message);
    }
}