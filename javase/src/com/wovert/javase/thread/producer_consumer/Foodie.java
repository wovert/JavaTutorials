package com.wovert.javase.thread.producer_consumer;

public class Foodie extends Thread {
    @Override
    public void run() {
        /**
         * 消费者
         * 1. 是否存在东西
         * 2. 没有就等待
         * 3. 有就开始做
         * 4. 做完了，通知生产者，叫醒等待的生产者继续生产
         * 5. 数量减1
         */
        while(true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.flag) {
                        // 有
                        System.out.println("吃货再吃汉堡包");
                        Desk.flag = false;
                        Desk.lock.notifyAll(); // 唤醒使用这个所使用的所有线程
                        Desk.count--;
                    } else {
                        // 没有就等待
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
