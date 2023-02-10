package com.wovert.javase.string;

import java.util.Arrays;
import java.util.Scanner;

public class DemoString {
    public static void main(String[] args) {
        // 字符串直接赋值时，其值在编译期间能不能确定，能确定就会在常量池中创建并指向该对象，如果不能，将在运行期在堆中创建对象
        String a = "a"; // 常量池
        String a1 = a + 1; // a1运行时才能确定值， 运行时 a+1在堆内存创建空间
        String b = "a1";
        System.out.println(a == b); // false

        final String c = "c"; // c常量
        String c1 = c + 1; // c1编译时确定值
        String b1 = "c1";
        System.out.println(c1 == b1); // true

        final String d = getD(); // 调用方法在运行期返回结果
        String d1 = d + 1; // c1编译时确定值
        String e1 = "d1";
        System.out.println(d1 == e1); // false

        String x = "x" + 1; // 编译时确定x的值
        String y = "x1";
        System.out.println(x == y); // true


        String str = "akdfJjkse92013323";
        String str2 = "akdfjjkse92013323";
        String str3 = "AKDFJJKSE92013323";

        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";

        System.out.println(s1 == s3); // false s2 + "c" 系统底层StringBuilder的append，再其转换为toString对象

        System.out.println(s1 == ("a" + "b" + "c")); // true 常量优化机制，编译时，"a"+"b"+"c"拼接为abc

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int num = sc.nextInt();
        System.out.println("请输入字符串");
//        String s = sc.nextLine(); // 10 + 回车符
        String s = sc.next();

        System.out.println(num);
        System.out.println(s);

        // length
        System.out.println("str.length=" + str.length());

        // equals
        System.out.println(str.equals(str2)); // false
        System.out.println(str.equalsIgnoreCase(str3)); // true

        // trim
        String strTrim = " abc ";
        System.out.println(strTrim.trim().length());

        // charAt: 索引位置所在的字符
        System.out.println(str.charAt(1));

        // toCharArray
        System.out.println(str.toCharArray());

        char[] cs = {'a','b','c'};
        System.out.println(new String(cs));

        // Arrays.toString()
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        // replaceAll
        System.out.println(str.replaceAll("[0-9]", "*"));
        System.out.println(str.replaceAll("\\d", "*"));
    }

    private static String getD() {
        return "d";
    }
}
