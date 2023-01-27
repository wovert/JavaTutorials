package com.wovert.javase.thread.producer_consumer;

public class DemoProducerConsumer {
    public static void main(String[] args) {
        Foodie f = new Foodie();
        Coocker c = new Coocker();
        /*
        套路：
        1. while(true)
        2. synchronized 锁对象唯一
        3. 判断共享数据是否结束，结束
        4. 判断共享数据是否结束，没有结束
        5.
        */

        f.start();
        c.start();
    }
}
