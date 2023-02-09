package demo.java.javase.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 自定义异常
 */
class HotelAgeException extends Exception {
    public HotelAgeException() {
        super("年龄18岁一下，80岁以上住客必须有亲属陪同～");
    }
}

public class DemoThrows {
    public static void main(String[] args) {
//        try {
////            test();
////            testAge();
//        } catch (ArithmeticException e) {
//            System.out.println("除数不能为零");
//            e.printStackTrace();
//        } catch (InputMismatchException e) {
//            System.out.println("请输入整数");
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } catch (Throwable e) {
//            System.out.println("Throwable");
//            e.printStackTrace();
//        }

        try {
            testThree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int test() throws ArithmeticException, InputMismatchException {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        return one/two;
    }

//    static void testAge() throws Throwable {
    static void testAge() throws Exception {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (age < 19 || age > 80) {
            throw new Exception("年龄18岁一下，80岁以上住客必须有亲属陪同～");
        } else {
            System.out.println("谢谢入住本酒店");
        }
    }

    static void testOne() throws HotelAgeException{
        throw new HotelAgeException();
    }

    static void testTwo() throws  Exception {
        try {
            testOne();
        } catch(HotelAgeException e) {
            throw new Exception("我是新产生异常1", e);
        }
    }

    static void testThree() throws Exception {
        try {
            testTwo();
        } catch (Exception e) {
            Exception e1 = new Exception("我是新产生异常2");
            e1.initCause(e);
            throw e1;
        }
    }

}
