package com.huaxu.core.designModel.acitonModel.templateMethod.abstractClass.impClass;

import com.huaxu.core.designModel.acitonModel.templateMethod.abstractClass.DataBases;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: MysqlDataBases</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/17 22:32</p>
 * <p>创建用户：huaxu</p>
 */
public class MysqlDataBases extends DataBases {

    @Override
    protected void gouziFunction() {
        System.out.println("开始初始化MYSQL");
    }

    @Override
    protected void addDriver() {
        System.out.println("mysql 加载驱动");
    }

    @Override
    protected void closeDriver() {
        System.out.println("mysql 卸载驱动");
    }
}