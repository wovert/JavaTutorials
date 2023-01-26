package com.wovert.javase.io.objectstream;

import java.io.Serializable;

public class Student implements Serializable {
    // 设置自定义序列号
    private static final long serialVersionUID = 1L;

    public String name;
    private transient int age; // 忽略此属性序列化

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
