package com.wovert.javase.string;

import java.util.Arrays;
import java.util.Scanner;

public class DemoString {
    public static void main(String[] args) {
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
}
