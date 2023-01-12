package com.wovert.javase.string;

import java.util.Arrays;

public class DemoString {
    public static void main(String[] args) {
        String str = "akdfJjkse92013323";
        String str2 = "akdfjjkse92013323";
        String str3 = "AKDFJJKSE92013323";

        // length
        System.out.println("str.length=" + str.length());

        // equals
        System.out.println(str.equals(str2)); // false
        System.out.println(str.equalsIgnoreCase(str3)); // true

        // trim
        String strTrim = " abc ";
        System.out.println(strTrim.trim().length());

        //

        // charAt: 索引位置所在的字符
        System.out.println(str.charAt(1));
        // toCharArray
        System.out.println(str.toCharArray());

        char[] cs = {'a','b','c'};
        System.out.println(new String(cs));

        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        // replaceAll
        System.out.println(str.replaceAll("[0-9]", "*"));
        System.out.println(str.replaceAll("\\d", "*"));
    }
}
