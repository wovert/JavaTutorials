package com.wovert.javase.string;

import java.io.UnsupportedEncodingException;

public class DemoStringCompare {
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

        String a = "a"; // 编译时确定
        String a1 = a + 1; // 运行时确定, 因为a是变量，不能编译时确定
        String a2 = "a1"; // 编译时确定
        System.out.println(a1 == a2); // false

        final String b = "b"; // 编译时确定
        String b1 = b + "1"; // 编译时确定
        String b2 = "b1";  // 编译时确定
        System.out.println(b1 == b2); // true

        String c = getC(); // 编译时不运行方法，所以 c的值不能确定
        String c1 = c + 1;
        String c2 = "c1";
        System.out.println(c1 == c2); // false

        final String d = getD(); // 编译时不运行方法，所以 c的值不能确定
        String d1 = d + 1; // 堆中创建对象
        String d2 = "d1";
        System.out.println(d1 == d2); // false
    }

    static String getC() {
        return "c";
    }

    static String getD() {
        return "d";
    }
}
