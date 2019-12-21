package com.huaxu.core.basic.compare;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/12 14:59</p>
 * <p>author：huaxu</p>
 */
public class ComparatorDemo {

    private static class Student implements Comparable<Student>{
        int age;
        String name;
        String sex;

        public Student(int age, String name, String sex) {
            this.age = age;
            this.name = name;
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            return this.age - o.age;
        }
    }

    public static void main(String[] args) {


        List<Student> list = new ArrayList<>();
        list.add(new Student(10, "张三", "男"));
        list.add(new Student(11, "李四", "男"));
        list.add(new Student(5, "王五", "女"));
        list.add(new Student(16, "赵六", "男"));

        Collections.sort(list, Comparator.comparingInt(o -> o.age));

        for (Student student : list) {
            System.out.println(student);
        }
    }
}