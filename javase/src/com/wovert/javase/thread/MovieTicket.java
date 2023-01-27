package com.wovert.javase.thread;

import java.util.concurrent.locks.ReentrantLock;

public class MovieTicket implements Runnable {
    private static int count = 100; // 票的数量
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public  void run() {
        // this 当前线程对象
        while(true) {
            if("窗口1".equals(Thread.currentThread().getName())) {
                boolean result = synchronizedMethod();
                if (result) {
                    break;
                }
            }
            if("窗口2".equals(Thread.currentThread().getName())) {
                try {
                    lock.lock();
                    if (count == 0) {
                        break;
                    } else {
                        Thread.sleep(10);
                        count--;
                        System.out.println(Thread.currentThread().getName() + "在卖票，还剩下" + count);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    private static synchronized boolean synchronizedMethod() {
        if (count == 0) {
            return true;
        } else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;
            System.out.println(Thread.currentThread().getName() + "在卖票，还剩下" + count);
            return false;
        }
    }
}
