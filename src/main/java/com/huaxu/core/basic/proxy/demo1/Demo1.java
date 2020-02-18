package com.huaxu.core.basic.proxy.demo1;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/18 11:22</p>
 * <p>author：huaxu</p>
 */
public class Demo1 {

    private interface A {
        public void a();
        public Object aaa(String s1, int i);
    }

    private interface B {
        public void b();
    }

    @Test
    public void test1() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        //这里创建一个空实现的调用处理器。
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("你好！！！！");//注意这里添加了一点小逻辑
                return "Hello";//这里改为返回"Hello"
            }
        };
        Object obj = Proxy.newProxyInstance(classLoader, new Class[]{A.class, B.class}, invocationHandler);
        //强转为A和B接口类型，说明生成的代理对象实现了A和B接口
        A a = (A) obj;
        B b = (B) obj;

        a.toString();//注意这里调用了toString()方法
        b.getClass();//注意这里调用了getClass()方法

        //这里在A接口中添加了一个方法public Object aaa(String s1, int i);
        Object hello = a.aaa("Hello", 100);
        System.out.println(obj.getClass());//这里看一下代理对象是什么
        System.out.println(hello);//这里看一下返回值是什么
    }
}