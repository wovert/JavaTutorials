package com.wovert.javase.compare;

// 比較器
public class Cat implements  Comparable<Cat> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Cat c) {
        if (this.age < c.age) {
            return -1;
        } else if (this.age > c.age) {
            return 1;
        } else {
            return 0;
        }
    }

}