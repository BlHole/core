package com.huaxu.core.basic.T;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/01 11:35
 */
public class ExtendSuper implements Translatable<Stu>{

    public static void main(String[] args) {
        ExtendSuper ex = new ExtendSuper();
        Stu engine = ex.getEngine();
        System.out.println(engine);
    }

    @Override
    public Stu getEngine() {
        return new Stu("你好", "cool");
    }
}