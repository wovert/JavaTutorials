package com.wovert.javase.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "表白" + i);
        }
        // 返回值表示线程执行完毕之后的结果
        return "答应";
    }
}
