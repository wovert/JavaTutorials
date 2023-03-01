package com.wovert.javase.wrapper;

public class DemoInteger {
    public static void main(String[] args) {
        Integer i = new Integer(50); // java9开始被废弃
        Integer j = Integer.valueOf(50);

        int a = j.intValue(); // 包装类对象转换成基本数据类型

        // 字符串to数字
        Integer m = Integer.valueOf("456");

        Integer i3 = 100;

        // i3 编程基本数据类型进行计算，计算结果再次自动装箱编程 Integer 对象赋值给i3
        i3 += 200;
        System.out.println(i3);

        Integer i4 = null;
        // 只要是对象必须判断是否为空
        if (i4 != null) {
            i4 += 200;
        }
        System.out.println(i4);

        // stringToInteger
        String s1 = "100";
        int i1 = 200;
        System.out.println(s1 + i1);

        int i2 = Integer.parseInt(s1);
        System.out.println(i2 + i1);

        // Int2string
        System.out.println(i1 + "" + 300);

        String s3 = String.valueOf(i1);
        System.out.println(s3 + 300);

    }
}
