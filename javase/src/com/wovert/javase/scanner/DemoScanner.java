package com.wovert.javase.scanner;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("a=" + a);

        String str = sc.next();
        System.out.println("str=" + str);
    }
}
