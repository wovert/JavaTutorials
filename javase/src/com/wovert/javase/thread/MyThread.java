package com.wovert.javase.thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<100; i++) {

            System.out.println(Thread.currentThread().getName() + "线程开启" + i);
        }
    }

    public MyThread(String name) {
        super(name);
    }
}
