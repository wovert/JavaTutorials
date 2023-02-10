package com.wovert.javase.collection;

import java.util.*;

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
        Notice notice1 = new Notice(1, "欢迎光临网站1", "Bob", new Date());
        Notice notice2 = new Notice(2, "请同学按时提交作业", "Alice", new Date());
//        Notice notice3 = new Notice(3, "考勤通知", "老师", new Date(System.currentTimeMillis() + 1000));
        Notice notice3 = new Notice(3, "考勤通知", "White", new Date());
        Notice notice4 = new Notice(3, "我的日程", "Jack", new Date());

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

        System.out.println("-----------");

        Cat huahua = new Cat("花花", 12, "英国短脚猫");
        Cat fanfan = new Cat("凡凡", 3, "中国田园猫");

        Set setCat = new HashSet();
        setCat.add(huahua);
        setCat.add(fanfan);

        // show
        Iterator itCat = setCat.iterator();
        while(itCat.hasNext()) {
            System.out.println(itCat.next());
        }

        Cat huahua2 = new Cat("花花", 12, "英国短脚猫");
        setCat.add(huahua2);
        System.out.println("--------");
        Iterator itCat2 = setCat.iterator();
        while(itCat2.hasNext()) {
            System.out.println(itCat2.next());
        }

        // TreeSet
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(4);
        ts.add(2);
        System.out.println(ts); // [1, 2, 3, 4, 5]

        TreeSet<Notice> ts2 = new TreeSet<>();
        ts2.add(notice2);
        ts2.add(notice1);
        ts2.add(notice4);
        ts2.add(notice3);
        System.out.println(ts2);


        TreeSet<Notice> ts3 = new TreeSet<>(new Comparator<Notice>() {
            @Override
            public int compare(Notice o1, Notice o2) {
                // o1 现在要存入的元素
                // 02 已经存入到集合中的元素
                int result = o1.getId() - o2.getId();
                result = result == 0 ? o1.getCreator().compareTo(o2.getCreator()) : result;
                return result;
            }
        });
        ts3.add(notice2);
        ts3.add(notice1);
        ts3.add(notice4);
        ts3.add(notice3);
        System.out.println(ts3);


    }
}
