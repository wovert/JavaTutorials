package com.wovert.javase.thread;

public class Ticket implements Runnable {
    private static int count = 100; // 票的数量
    private static Object obj = new Object();

    @Override
    public void run() {
        // this 当前线程对象
        while(true) {
            // 同步代码块：共享数据开始代码
            synchronized (obj) { // 多个线程必须使用同一把锁
                if (count <= 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "在卖票，还剩下" + count);

                }
            }

        }
    }
}
