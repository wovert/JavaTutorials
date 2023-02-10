package com.wovert.javase.wrapper;

public class DemoInteger {
    public static void main(String[] args) {
        Integer i = new Integer(50); // java9开始被废弃
        Integer j = Integer.valueOf(50);

        int a = j.intValue(); // 包装类对象转换成基本数据类型

        // 字符串to数字
        Integer m = Integer.valueOf("456");
    }
}
