package com.wovert.javase.compare;

import java.util.Arrays;

/**
 * 对象比较器
 */
public class DemoCompare {
    public static void main(String[] args) {
        int[] nums = {12,32,44,2,4,65};
        Arrays.sort(nums);

        for(int i:nums) {
            System.out.println(i);
        }

        String[] names = {"abc", "abo", "vince", "jack", "tom"};
        Arrays.sort(names);
        for (String str: names) {
            System.out.println(str);
        }

        Cat[] cats = {new Cat("tom", 20), new Cat("jerry", 1), new Cat("huahua", 5)};
        // 接口实现对象比较器
        Arrays.sort(cats);
        for(Cat cat: cats) {
            System.out.println(cat);
        }

        Dog[] Dogs = {new Dog("tom", 20), new Dog("jerry", 1), new Dog("huahua", 5)};
        // 接口实现对象比较器
        Arrays.sort(Dogs, new DogComparator());
        for(Dog dog: Dogs) {
            System.out.println(dog);
        }

    }
}
