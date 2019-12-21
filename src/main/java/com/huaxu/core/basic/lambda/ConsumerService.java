package com.huaxu.core.basic.lambda;

import java.util.function.Consumer;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/06 14:49
 */
public class ConsumerService {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Zhangsan");

        Consumer<User> filter = userTemp -> userTemp.setName("LiSi");
        filter.accept(user);
        System.out.println(user);
    }
}

class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}