package com.wovert.javase.string;

public class CreateString {
    public static void main(String[] args) {
        String name1 = "wovert";
        String name2 = new String();
        String name3 = new String(name1);
        byte[] bytes = {29, 82, 93, 100};
        String name4 = new String(bytes);
        char[] chars = {'a','b','c'};
        String name5 = new String(chars);
    }
}
