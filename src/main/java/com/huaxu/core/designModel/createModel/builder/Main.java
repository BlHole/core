package com.huaxu.core.designModel.createModel.builder;

import com.huaxu.core.designModel.createModel.builder.impl.Product;
import com.huaxu.core.designModel.createModel.builder.impl.abstructClass.Builder;
import com.huaxu.core.designModel.createModel.builder.impl.abstructClass.BuilderModelB;
import com.huaxu.core.designModel.createModel.builder.impl.abstructClass.Director;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 建造者模式</p>
 * <p>创建日期: 2019/06/08 10:09</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
//        Builder builder = new BuilderModelA();
        Builder builder = new BuilderModelB();
        Director director = new Director(builder);

        Product construct = director.construct();
        construct.show();
    }
}