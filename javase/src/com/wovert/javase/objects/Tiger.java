package com.wovert.javase.objects;

// 比較器
public class Tiger implements  Cloneable{
    private String name;
    private int age;

    public Tiger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tiger() {
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

    // 重写克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
