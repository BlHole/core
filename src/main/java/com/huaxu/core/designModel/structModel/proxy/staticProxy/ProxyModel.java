package com.huaxu.core.designModel.structModel.proxy.staticProxy;

import com.huaxu.core.designModel.structModel.proxy.model.RealSubject;
import com.huaxu.core.designModel.structModel.proxy.model.Subject;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: ProxyModel</p>
 * <p>文件描述: 静态代理</p>
 * <p>创建日期: 2019/06/08 11:00</p>
 * <p>创建用户：huaxu</p>
 */
public class ProxyModel implements Subject {

    private RealSubject realSubject = new RealSubject();
    @Override
    public void request() {
        if (realSubject==null) {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.request();
        handelRequest();
    }

    private void preRequest() {
        System.out.println("静态代理-------原方法执行之前");
    }

    private void handelRequest() {
        System.out.println("静态代理-------原方法执行之后");
    }

}