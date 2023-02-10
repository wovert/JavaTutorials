package com.wovert.javase.thread.producer_consumer;

public class Coocker extends Thread{
    @Override
    public void run() {
        /**
         * 生产者
         * 1. 是否有东西
         * 2. 有等待，没有则生产
         * 3. 叫醒等待的消费者
         */
        while(true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (!Desk.flag) {
                        // 生产
                        System.out.println("厨师正在生产汉堡包");
                        Desk.flag = true;
                        Desk.lock.notifyAll();
                    } else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
