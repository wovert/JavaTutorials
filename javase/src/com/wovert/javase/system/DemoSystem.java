package com.wovert.javase.system;

public class DemoSystem {
    public static void main(String[] args) {
        System.out.println("start");
//        System.exit(0); // 终止当前运行的JVM虚拟机
        long l = System.currentTimeMillis(); // 1970-1-1 毫秒数
        System.out.println(l);

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[10];

//        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        // arr1 最后两个元素到 arr2最后两个元素
        System.arraycopy(arr1, 3, arr2, 8, 2);

        for (int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("end");
    }
}
