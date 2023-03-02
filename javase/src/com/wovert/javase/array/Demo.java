package com.wovert.javase.array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        // 动态初始化: 指定数组长度，默认初始化为数据类型默认值
        byte[] bArr = new byte[3];

        System.out.println(bArr);
        for (int i = 0; i < 3; i++) {
            System.out.println("bArr[" + i + "]=" + bArr[i]);
        }
        System.out.println("--------------");
        

        // 数组元素打乱
        int[] arr = {12, 48, 23, 92, 83};
        System.out.println(Arrays.toString(arr));

        Random r = new Random();
        for (int i=0; i<arr.length; i++) {
            int index = r.nextInt(arr.length);
            System.out.println("index=" + index);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));


        // Binary search
        int[] numbers = {1,3,5,10,29,39,60};

        int myIndex = myBinarySearch(numbers, 39);
        System.out.println("myIndex=" + myIndex);
        int index = Arrays.binarySearch(numbers, 39);
        System.out.println("index=" + index); // 5

        // output array
        System.out.println(Arrays.toString(numbers));

        // sort
        int[] numbers2 = {20,93,18,29,30,60,10};
        Arrays.sort(numbers2); // Quick sort
        System.out.println(Arrays.toString(numbers2));

        // copy arrays
        int[] newNumbers = Arrays.copyOf(numbers2, 5);
        System.out.println(Arrays.toString(newNumbers));

        int[] newNums = new int[numbers2.length];

        // 源数组, 源数组开始索引, 目标数组, 目标数组开始索引, 源数组长度
        System.arraycopy(numbers2, 0, newNums, 0, numbers2.length);
        System.out.println(Arrays.toString(newNums));

        /**
         * 数组的复制
         * 效率由高到低排序是：System.arraycopy < Arrays.copyof < for
         */

    }

    private static int myBinarySearch(int[] arr, int i) {
        int min = 0;
        int max = arr.length - 1;
        while(min <= max) {
            int mid = (min + max) >> 1;
            if (arr[mid] > i) {
                max = mid - 1;
            } else if(arr[mid] < i) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
