package com.huaxu.core.basic.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/12 15:05</p>
 * <p>author：huaxu</p>
 */
public class ComparableDemo {

    private static class Student implements Comparable<Student>{
        int age;
        String name;

        @Override
        public int compareTo(Student o) {
            return this.age - o.age;
        }

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(10, "张三");
        Student student2 = new Student(89, "李四");
        Student student3 = new Student(5, "王五");
        Student student4 = new Student(120, "赵六");

        Student[] students = {student1, student2, student3, student4};
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}