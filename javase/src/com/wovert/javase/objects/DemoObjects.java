package com.wovert.javase.objects;

import com.wovert.javase.collection.Student;

import java.util.Objects;

public class DemoObjects {
    public static void main(String[] args) {
        Student s = new Student();
        s = null;
        String result = Objects.toString(s, "随便写一个");
        System.out.println(Objects.isNull(s)); // true
        System.out.println(Objects.nonNull(s)); // false
        System.out.println(result);
    }
}
