package com.huaxu.core.basic.T;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/01 11:37
 */
public class Stu implements Translatable<Stu> {


    private String name;
    private String value;

    public Stu(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public Stu getEngine() {
        return new Stu("huaxu", "cool");
    }
}