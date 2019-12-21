package com.huaxu.core.designModel.structModel.decorator.ImpClass;

import com.huaxu.core.designModel.structModel.decorator.abstractInter.ConfirmPay;
import com.huaxu.core.designModel.structModel.decorator.abstractInter.DecoratorConfirmPay;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: AddLogConfirmPay</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/17 21:58</p>
 * <p>创建用户：huaxu</p>
 */
public class AddLogConfirmPay extends DecoratorConfirmPay{

    public AddLogConfirmPay(ConfirmPay confirmPay) {
        super(confirmPay);
    }

    @Override
    public void send() {
        super.send();
        addLog();
    }

    private void addLog(){
        System.out.println("添加打印日志");
    }
}