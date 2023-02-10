package com.wovert.javase.string;

public class DemoStringBuilder {
    public static void main(String[] args) {

        connectString();
        connectStringBuilder();

        StringBuilder sb = new StringBuilder();
        sb.append("abc").append("def").append("xyz");
        String s = sb.toString();
        System.out.println("s=" + s);
    }

    private static void connectString() {
        long starTime= System.currentTimeMillis(); // 毫秒数

        String sum = "";
        for (int i=1; i<=50000; i++) {
            sum += i;
        }
//        System.out.println(sum);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-starTime);
    }

    private static void connectStringBuilder() {
        long starTime= System.currentTimeMillis(); // 毫秒数

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=50000; i++) {
            sb.append(i);
        }
//        System.out.println(sum);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-starTime);
    }


}
