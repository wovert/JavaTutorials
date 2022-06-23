package com.wovert.javase.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.isEmpty());
        // add element 有序，可重复
        list.add("Java");
        System.out.println(list.isEmpty());
        list.add("Go");
        list.add("C");
        list.add("C++");
        list.add("Swift");

        System.out.println(list.contains("Go"));

        System.out.println("列表中元素个数为：" + list.size());

        // traverse
        for(Object str: list) {
            System.out.println(str.toString());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // remove
        Object obj1 = list.remove("C++");
        Object obj2 = list.remove(0);
        System.out.println("remove:" + obj1.toString());
        System.out.println("remove:" + obj2.toString());
        System.out.println(list.toString());

        // to Array
        Object[] obj = list.toArray();
        System.out.println("转换成数组：" + Arrays.toString(obj));

        System.out.println("-----------");


    }
}
