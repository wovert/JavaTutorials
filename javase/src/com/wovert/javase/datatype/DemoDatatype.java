package com.wovert.javase.datatype;

public class DemoDatatype {
    public static void main(String[] args) {
        char c = 127 + 2;
        char d = 0xff;
        System.out.printf("%d\n", (int)c);
        System.out.printf("%d\n", (int)d);

        float salary = 33232.23f;
        long width = 20004454430293l;

        System.out.printf("salary=%.2f\n", salary);
        System.out.printf("width=%d\n", width);

        byte a = 3;
        byte b = 4;

        // 隐私转换：char, byte, short 进行运算时，自动提升为int类型，然后再进行运算
        byte result = (byte)(a + b);
        System.out.println("result=" + result);

        // Java 常量优化机制：编译时进行运算，自动判断结果是否再定义数据类型范围内，不在范围内编译出错，再范围内通过编译
        byte h = 3 + 4;
        System.out.println("h=" + h);

        byte u = (byte)(127 + 1);
        System.out.println("u=" + u); // -128

        short ss = 1;
        ss += 1; // ss = (short)(ss + 1) 扩展赋值运算符底层会自带强转功能
        System.out.println(ss);

    }
}
