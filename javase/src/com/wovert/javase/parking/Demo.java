package com.wovert.javase.parking;

public class Demo {
    public static void main(String[] args) {
        // 装箱
        Integer i = 100; // Integer.valueOf(100);

        // 拆箱
        /*
            i = i + 200;
            i = i.intValue() + 200; // 自动拆箱
            i = 300; // Integer.valueOf(100);
        */
        i += 200;
        System.out.println(i);
    }
}
