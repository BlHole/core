package com.huaxu.core.designModel.structModel.decorator;

import com.huaxu.core.designModel.structModel.decorator.ImpClass.AddLogConfirmPay;
import com.huaxu.core.designModel.structModel.decorator.ImpClass.OriginPay;
import com.huaxu.core.designModel.structModel.decorator.abstractInter.ConfirmPay;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: 装饰模式</p>
 * <p>创建日期: 2019/05/17 21:55</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {
    public static void main(String[] args) {
        ConfirmPay pay = new OriginPay();
        pay.send();
        System.out.println("--------------------");

        ConfirmPay addLogConfirmPay = new AddLogConfirmPay(pay);
        addLogConfirmPay.send();
    }
}