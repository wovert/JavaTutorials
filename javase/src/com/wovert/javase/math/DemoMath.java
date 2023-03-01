package com.wovert.javase.math;

import java.util.Arrays;
import java.util.Random;

public class DemoMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1.2)); // 1.2
        System.out.println(Math.ceil(1.4)); // 2.0
        System.out.println(Math.floor(1.4)); // 1.0
        System.out.println(Math.round(1.4)); // 1
        System.out.println(Math.round(1.6)); // 2
        System.out.println(Math.min(10, 20)); // 10
        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.pow(2,3)); // 2x2x2=8.0
        for (int i=0; i<100; i++) {
            System.out.println(Math.random()); // [0.0, 1.0)  0.0包含，1.0不包含
        }

        // 伪随机数
        Random r = new Random();
        System.out.println(r.nextInt(100));

        int[] nums = {1,2,33,12,22};
        Arrays.sort(nums);

        int[] temp = new int[nums.length];        // arraycopy(数据源, 起始索引, 目的数组, 起始索引, 拷贝个数)
        System.arraycopy(nums, 0, temp, 0, temp.length);
//lay
        for (int i = 0; i < nums.length; i++) {
            System.out.println(temp[i]);
        }

        // 二分查找算法 数组必须时有序的
        int index = Arrays.binarySearch(nums, 12);
        System.out.println("index=" + index); // 2
    }
}
