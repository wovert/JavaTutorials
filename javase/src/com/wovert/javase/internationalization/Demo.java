package com.wovert.javase.internationalization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Locale localeCn = Locale.CHINA;
        // 符合美国英语
        Locale localeEn = new Locale("en", "US");


        Scanner scanner = new Scanner(System.in);

        ResourceBundle rb = ResourceBundle.getBundle("com.wovert.javase.internationalization.info", localeCn);
//        ResourceBundle rb = ResourceBundle.getBundle("com.wovert.javase.internationalization.info", localeEn);

        System.out.println(rb.getString("welcome"));

        System.out.println(rb.getString("input.username"));
        String username = scanner.next();

        System.out.println(rb.getString("input.password"));
        String password = scanner.next();

        if ("admin".equals(username) && "123456".equals(password)) {
            String info = MessageFormat.format(rb.getString("login_success_info"), "admin");
            System.out.println(info);
        } else {
            System.out.println(rb.getString("login_fail_info"));
        }

    }
}
