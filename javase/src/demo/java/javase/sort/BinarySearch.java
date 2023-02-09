package demo.java.javase.sort;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {10, 2, 9, 5, 7, 1, 3, 6};
        Arrays.sort(nums);
        for (int v: nums) {
            System.out.println(v);
        }

        int index = search(nums, 9);
        System.out.println("index=" + index);
    }

    public static int search(int[] num, int key) {
        int start = 0;
        int end = num.length - 1;
        while(start <= end) {
            int middle = (start+end)/2;
            if (num[middle] > key) {
                end = middle - 1;
            } else if (num[middle] < key) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
