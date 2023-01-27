package com.wovert.javase.thread.producer_consumer;

public class Desk {
  // flag: 桌上是否有东西
    public static boolean flag = false;

    // 数量
    public static int count = 10;

    // 锁对象
    public static final Object lock = new Object();
}

