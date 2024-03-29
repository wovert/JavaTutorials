package com.wovert.javase.thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // 线程启动后执行的代码
        for (int i=0; i<100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "线程" + i);
        }
    }
}
