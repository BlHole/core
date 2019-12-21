package com.huaxu.core.designModel.structModel.decorator.ImpClass;

import com.huaxu.core.designModel.structModel.decorator.abstractInter.ConfirmPay;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: OriginPay</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/17 21:55</p>
 * <p>创建用户：huaxu</p>
 */
public class OriginPay implements ConfirmPay {

    @Override
    public void send() {
        System.out.println("向业务系统记录日志");
    }
}