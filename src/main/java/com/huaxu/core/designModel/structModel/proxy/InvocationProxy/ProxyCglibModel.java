package com.huaxu.core.designModel.structModel.proxy.InvocationProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: ProxyCglibModel</p>
 * <p>文件描述: cglib的代理</p>
 * <p>创建日期: 2019/06/10 10:25</p>
 * <p>创建用户：huaxu</p>
 */
public class ProxyCglibModel implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class<?> c) {
        enhancer.setSuperclass(c);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("cglib代理-------原方法执行之前");
        System.out.println("cglib代理-------调用方法名称：" + method.getName());
        Object invoke = proxy.invokeSuper(obj, args);
        System.out.println("cglib代理-------原方法执行之后");
        return invoke;
    }
}