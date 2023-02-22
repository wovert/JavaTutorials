package com.wovert.javase.random;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    public static void main(String[] args) {

//        testRandom();
        guessNumber();
    }

    private static void testRandom() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            // [0,10]包括0，不包括10
            int num = r.nextInt(10) + 1; // 1-10
            System.out.println("num=" + num);
        }
    }


    /**
     * 猜数字 1-100
     */
    private static void guessNumber() {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("请输入数字：");
            int num = sc.nextInt();
            System.out.println();
            if (num > randomNum) {
                System.out.println("猜大了");
            } else if (num < randomNum) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜，猜中了");
                break;
            }
        }
    }
}
