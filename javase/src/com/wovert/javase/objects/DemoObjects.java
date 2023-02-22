package com.wovert.javase.objects;

import com.wovert.javase.collection.Student;

import java.util.Objects;

public class DemoObjects {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student();
        s = null;
        String result = Objects.toString(s, "随便写一个");
        System.out.println(Objects.isNull(s)); // true
        System.out.println(Objects.nonNull(s)); // false
        System.out.println(result);

        Tiger t = new Tiger("小白", 20);

        // 对象克隆
        Tiger t2 = (Tiger) t.clone();
        System.out.println(t);
        System.out.println(t2);
        System.out.println(t == t2); // false
    }
}
