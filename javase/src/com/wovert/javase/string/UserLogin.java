package com.wovert.javase.string;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "123456";

        for (int i=1; i<=3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入用户名：");
            String userNameVal = sc.nextLine();
            System.out.print("请输入密码：");
            String passwordVal = sc.nextLine();

            if (userName.equals(userNameVal) && password.equals(passwordVal)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i==3) {
                    System.out.println("今天您的登录次数已达到今日上限，明日再试");
                } else {
                    System.out.println("登录失败，您还有" + (3-i) + "次机会");
                }

            }
        }
    }
}
