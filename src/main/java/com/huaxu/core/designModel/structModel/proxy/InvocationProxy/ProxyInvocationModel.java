package com.huaxu.core.designModel.structModel.proxy.InvocationProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: ProxyInvocationModel</p>
 * <p>文件描述: 动态代理</p>
 * <p>创建日期: 2019/06/10 10:12</p>
 * <p>创建用户：huaxu</p>
 */
public class ProxyInvocationModel implements InvocationHandler {
    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理-------原方法执行之前");
        Object invoke = method.invoke(target, args);
        System.out.println("动态代理-------原方法执行之后");
        return invoke;
    }
}