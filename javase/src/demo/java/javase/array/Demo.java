package demo.java.javase.array;

import java.sql.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // Binary search
        int[] numbers = {1,3,5,10,29,39,60};

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
}
