package com.wovert.javase.thread;

public class MyTicket implements Runnable {
    private static int count = 100; // 票的数量

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
                // 同步代码块
                synchronized (MyTicket.class) {
//                synchronized (this) {
                    if (count == 0) {
                        break;
                    } else {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        count--;
                        System.out.println(Thread.currentThread().getName() + "在卖票，还剩下" + count);
                    }
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
