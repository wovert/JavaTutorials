package com.wovert.javase.scanner;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 结束标记：空格，tab键
        String str = sc.next();
        System.out.println("str=" + str);

        int a = sc.nextInt(); // 10 + 回车换行符
        System.out.println("a=" + a);


        // 结束标记：回车换行符
        String s = sc.nextLine(); // 读取上一个回车换行符
        System.out.println("s=" + s); // s=


    }
}
