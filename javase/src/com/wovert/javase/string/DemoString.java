package com.wovert.javase.string;

import java.io.UnsupportedEncodingException;

public class DemoString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // string vs byte[]
        String str = new String("Java Program 编程");

        // string change to byte[]
//        byte[] arrs = str.getBytes(); // 默认utf-8 编码
        byte[] arrs = str.getBytes("GBK");
        for (int i=0; i<arrs.length; i++) {
            System.out.println(arrs[i] + " ");
        }
        System.out.println();

//        String str1 = new String(arrs);
        String str1 = new String(arrs, "GBK");
        System.out.println(str1);
    }
}
