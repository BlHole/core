package com.huaxu.core.classLoader.weakReference;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/29 10:36
 */
public class Apple{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Apple finalize " + name);
    }
}