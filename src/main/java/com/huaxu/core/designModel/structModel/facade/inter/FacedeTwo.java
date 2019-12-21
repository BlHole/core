package com.huaxu.core.designModel.structModel.facade.inter;

import com.huaxu.core.designModel.structModel.facade.impl.SubSystem1;
import com.huaxu.core.designModel.structModel.facade.impl.SubSystem2;
import com.huaxu.core.designModel.structModel.facade.impl.SubSystem3;
import com.huaxu.core.designModel.structModel.facade.impl.SubSystem4;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: FacedeOne</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/10 22:43</p>
 * <p>创建用户：huaxu</p>
 */
public class FacedeTwo implements AbstractFacede{

    private SubSystem3 subSystem3;
    private SubSystem4 subSystem4;

    public FacedeTwo() {
        this.subSystem3 = new SubSystem3();
        this.subSystem4 = new SubSystem4();
    }

    @Override
    public void method() {
        subSystem3.send();
        subSystem4.close();
    }
}