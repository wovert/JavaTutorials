package com.wovert.javase.collection;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎光临网站1", "管理员", new Date());
        Notice notice2 = new Notice(2, "请同学按时提交作业", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知", "老师", new Date());

        // add notice
        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);

        // show
        for (Object obj: noticeList) {
            System.out.println(((Notice)obj).getTitle());
        }

        Notice notice4 = new Notice(4, "在线编辑", "老师", new Date());
        noticeList.add(1, notice4);

        System.out.println("------");
        for (Object obj: noticeList) {
            System.out.println(((Notice)obj).getTitle());
        }

        noticeList.remove(3);

        notice4.setTitle("Java在线编辑");
        System.out.println("------");
        for (Object obj: noticeList) {
            System.out.println(((Notice)obj).getTitle());
        }
    }
}
