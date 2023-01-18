package com.wovert.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date(); // 当前时间
        System.out.println(d1); // now datetime: Mon Jan 16 11:58:19 KST 2023
        System.out.println(d1.getTime());
        d1.setTime(1000L * 3600);
        System.out.println(d1);

        Date d2 = new Date(1000L * 3600); // 一个小时 b
        System.out.println(d2); // 1970-1-1 09:00:00 + 1 = 10:00:00 时区

        // format date to string
//        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String s = sdf.format(d1);
        System.out.println(s);

        String ss = "2023-1-16 13:20:39";
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);
    }
}
