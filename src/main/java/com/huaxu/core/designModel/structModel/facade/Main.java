package com.huaxu.core.designModel.structModel.facade;

import com.huaxu.core.designModel.structModel.facade.inter.AbstractFacede;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 外观模式</p>
 * <p>创建日期: 2019/06/10 22:36</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {


    public static void main(String[] args) throws Exception {
        String clazz = "com.huaxu.core.designModel.structModel.facade.inter.FacedeOne";
//        String clazz = "com.huaxu.core.designModel.structModel.facade.inter.FacedeTwo";
        AbstractFacede facede = (AbstractFacede)Class.forName(clazz).newInstance();
        facede.method();
    }
}