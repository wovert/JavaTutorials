package demo.java.javase.string;

import java.util.Arrays;

public class DemoString {
    public static void main(String[] args) {
        String str = "akdfjjkse92013323";

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
