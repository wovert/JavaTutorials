package com.wovert.javase.math;

public class DemoMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1.2)); // 1.2
        System.out.println(Math.ceil(1.4)); // 2.0
        System.out.println(Math.floor(1.4)); // 1.0
        System.out.println(Math.round(1.4)); // 1
        System.out.println(Math.round(1.6)); // 2
        System.out.println(Math.min(10, 20)); // 10
        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.pow(2,3)); // 2x2x2=8.0
        for (int i=0; i<100; i++) {
            System.out.println(Math.random()); // [0.0, 1.0)  0.0包含，1.0不包含
        }
    }
}
