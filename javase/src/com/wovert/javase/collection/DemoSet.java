package com.wovert.javase.collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set set = new HashSet();

        // add
        set.add("red");
        set.add("green");
        set.add("blue");

        // traverse by Iterator
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        // add
        set.add("white");
        set.add("red"); // 插入失败不会报错
        Iterator it2 = set.iterator();
        System.out.println("----");
        while(it2.hasNext()) {
            System.out.println(it2.next() + " ");
        }

        System.out.println("-------------");
        Notice notice1 = new Notice(1, "欢迎光临网站1", "管理员", new Date());
        Notice notice2 = new Notice(2, "请同学按时提交作业", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知", "老师", new Date());
        Notice notice4 = new Notice(3, "考勤通知", "老师", new Date());

        Set set2 = new HashSet();
        set2.add(notice1);
        set2.add(notice2);
        set2.add(notice3);
        set2.add(notice4);
        // traverse by Iterator
        Iterator it3 = set2.iterator();
        while(it3.hasNext()) {
            System.out.println(it3.next() + " ");
        }

        System.out.println("---------");

        // search
        if (set2.contains(notice4)) {
            System.out.println(notice4);
        } else {
            System.out.println("没有找到");
        }

        for(Object obj: set2) {
            Notice n = (Notice)obj;
            if ("考勤通知".equals(n.getTitle())) {
                set2.remove(n);
            }
        }
    }
}
