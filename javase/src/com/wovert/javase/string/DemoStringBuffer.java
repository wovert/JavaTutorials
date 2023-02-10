package com.wovert.javase.string;

public class DemoStringBuffer {
    public static void main(String[] args) {
        String s = "hello";
        String ss = s + " world";

        for (int i = 0; i < 10; i++) {
            System.out.println("hello" + i);
        }

        // 线程安全
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 17; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        System.out.println(sb.capacity()); // 17 => 34
        System.out.println(sb.length());  // 17 => 24,
    }
}
