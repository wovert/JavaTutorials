package com.wovert.javase.thread;

public class DemoDeathLock {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();

        new Thread(() -> {
           while(true) {
               synchronized(objA) {
                   synchronized(objB) {
                       System.out.println("张三正在走路");
                   }
               }
           }
        }).start();

        new Thread(() -> {
            synchronized(objB) {
                synchronized(objA) {
                    System.out.println("李四正在走路");
                }
            }
        }).start();
    }
}
