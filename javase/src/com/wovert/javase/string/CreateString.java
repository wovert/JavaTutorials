package com.wovert.javase.string;

public class CreateString {
    public static void main(String[] args) {
        String name1 = "wovert";
        String name2 = new String(); // 空字符串
        System.out.println(name2.length()); // 0
        String name3 = new String(name1);
        System.out.println(name3.length()); // 6
        byte[] bytes = {29, 82, 93, 100};
        String name4 = new String(bytes);
        char[] chars = {'a','b','c'};
        String name5 = new String(chars);
        System.out.println("name5=" + name5);
    }
}
