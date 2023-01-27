package com.wovert.javase.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class DemoThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Thread.currentThread().setName("主线程");
//        for(int i=0; i<100; i++) {
//            // main
//            System.out.println(Thread.currentThread().getName() + "线程" + i);
//        }
        method1();
//        method2();
//        method3();

//        method4();
    }

    private static void method4() throws InterruptedException {
        System.out.println("method4 start---------");
        Thread.sleep(1000);
        System.out.println("method end-----");
    }

    private static void method3() throws ExecutionException, InterruptedException {
        // 3. 利用 Callable 和 Future 接口方式实现
        MyCallable mc = new MyCallable();

        // 获取线程执行完毕之后的结果
        FutureTask<String> ft = new FutureTask<>(mc);
        // 创建线程对象
        Thread t = new Thread(ft);
        // 启动线程
        System.out.println(t.getPriority()); //5
        t.setName("张三");
        t.setPriority(10); // min(1)-max(10)
        t.start();

        // 启动线程之后，获取执行结果
//        String result = ft.get();
//        System.out.println(result);

        MyCallable mc2 = new MyCallable();
        FutureTask<String> ft2 = new FutureTask<>(mc2);
        Thread t2 = new Thread(ft2);
        System.out.println(t2.getPriority()); //5
        t2.setName("李四");
        t2.setPriority(1);
        t2.start();
    }
    private static void method2() {
        // 2. 实现 Runnable 接口的方式进行实现
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());

        // 设置线程名
//        t1.setName("张三");
//        t2.setName("李四");
        t1.start();
        t2.start();
    }

    private static void method1() {
        // 实现多线程实现方法
        // 1. 继承 Thread 类的方式进行实现
        MyThread t1 = new MyThread("张三");
        MyThread2 t2 = new MyThread2("李四");
//        t1.run(); // 没有开启线程 运行

        t2.setName("女神");
        t1.setName("备胎");
        // 普通线程执行完毕之后，守护线程也没有继续运行下去的必要了
        t1.setDaemon(true);
        t1.start(); // 开启线程 Thread-0 线程名
        t2.start(); // 开启线程 Thread-1 线程名 JVM 调用run方法

    }
}
