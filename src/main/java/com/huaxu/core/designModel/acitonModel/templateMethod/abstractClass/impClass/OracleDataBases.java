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
public class OracleDataBases extends DataBases {


    @Override
    public void addDriver() {
        System.out.println("oracle 加载驱动");
    }

    @Override
    public void closeDriver() {
        System.out.println("oracle 卸载驱动");
    }
}