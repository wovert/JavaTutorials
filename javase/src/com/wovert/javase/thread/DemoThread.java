package com.wovert.javase.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class DemoThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for(int i=0; i<100; i++) {
            // main
            System.out.println(Thread.currentThread().getName() + "线程" + i);
        }
//        method1();
//        method2();

        method3();


    }

    private static void method3() throws ExecutionException, InterruptedException {
        // 3. 利用 Callable 和 Future 接口方式实现
        MyCallable mc = new MyCallable();

        // 获取线程执行完毕之后的结果
        FutureTask<String> ft = new FutureTask<>(mc);
        // 创建线程对象
        Thread t = new Thread(ft);
        // 启动线程
        t.start();

        // 启动线程之后，获取执行结果
        String result = ft.get();
        System.out.println(result);
    }

    private static void method2() {
        // 2. 实现 Runnable 接口的方式进行实现
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }

    private static void method1() {
        // 实现多线程实现方法
        // 1. 继承 Thread 类的方式进行实现
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
//        t1.run(); // 没有开启线程 运行
        t1.start(); // 开启线程 Thread-0 线程名
        t2.start(); // 开启线程 Thread-1 线程名 JVM 调用run方法

    }
}
