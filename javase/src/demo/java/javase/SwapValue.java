package demo.java.javase;

public class SwapValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        thirdValue(a, b);
        exp(a, b);
        asignFunc(a, b);
        moveBit(a, b);
    }
    private static void thirdValue(int a, int b) {
        System.out.println("交换前 a=" + a + ", b=" + b);
        // 1. 使用第三个变量
        int c = a + b;
        a = c - a;
        b = c - a;
        System.out.println("交换后 a=" + a + ", b=" + b);
    }
    private static void exp(int a, int b) {
        System.out.println("交换前 a=" + a + ", b=" + b);
        // 1. 使用第三个变量
        a = a + b - (b=a);
        System.out.println("交换后 a=" + a + ", b=" + b);
    }
    private static void asignFunc(int a, int b) {
        System.out.println("交换前 a=" + a + ", b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换后 a=" + a + ", b=" + b);
    }

    private static void moveBit(int a, int b) {
        System.out.println("交换前 a=" + a + ", b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("交换后 a=" + a + ", b=" + b);
    }
}
