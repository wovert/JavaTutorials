package com.wovert.javase.stream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class DemoEncodeDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "微明";
        byte[] bytes = s.getBytes();// 默认使用平台默认字符集，idea默认的utf-8中文编码，一个中文三个字节
        byte[] bytes2 = s.getBytes("UTF-8");
        byte[] bytes3 = s.getBytes("GBK"); // 一个中文2个字节
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes2));
        System.out.println(Arrays.toString(bytes3));

        String s1 = new String(bytes); // 解码 utf-8
        System.out.println(s1);
        String s2 = new String(bytes2);
        System.out.println(s2);
        String s3 = new String(bytes3, "GBK");
        System.out.println(s3);

    }
}
