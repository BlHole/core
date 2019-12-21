package com.huaxu.core.designModel.structModel.proxy;

import com.huaxu.core.designModel.structModel.proxy.InvocationProxy.ProxyCglibModel;
import com.huaxu.core.designModel.structModel.proxy.InvocationProxy.ProxyInvocationModel;
import com.huaxu.core.designModel.structModel.proxy.model.RealSubject;
import com.huaxu.core.designModel.structModel.proxy.model.Subject;
import com.huaxu.core.designModel.structModel.proxy.staticProxy.ProxyModel;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 代理模式</p>
 * <p>创建日期: 2019/06/08 10:59</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("===========静态代理============");
        ProxyModel proxyModel = new ProxyModel();
        proxyModel.request();


        System.out.println("===========动态代理============");
        ProxyInvocationModel model = new ProxyInvocationModel();
        Subject bind = (Subject)model.bind(new RealSubject());
        bind.request();


        System.out.println("===========cglib代理============");
        ProxyCglibModel cglibModel = new ProxyCglibModel();
        Subject proxy = (Subject)cglibModel.getProxy(RealSubject.class);
        proxy.request();
    }
}