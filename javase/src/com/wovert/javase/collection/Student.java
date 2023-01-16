package com.wovert.javase.collection;

public class Student {
    private String name;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;

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

    public void getInfo() {
        System.out.println("Name=" + this.getName() + ", age=" + this.getAge());
    }
}
