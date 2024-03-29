package com.wovert.javase.thread;

public class DemoTicket {
    public static void main(String[] args) {
//        Ticket t1 = new Ticket();
//        Ticket t2 = new Ticket();
//        Ticket t3 = new Ticket();
//
//        Thread th1 = new Thread(t1);
//        Thread th2 = new Thread(t2);
//        Thread th3 = new Thread(t3);
//            demo01();
//            demo02();
            demo03();
    }

    private static void demo03() {
        MovieTicket myTicket = new MovieTicket();

        Thread t1 = new Thread(myTicket);
        Thread t2 = new Thread(myTicket);

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }

    private static void demo02() {
        MyTicket myTicket = new MyTicket();

        Thread t1 = new Thread(myTicket);
        Thread t2 = new Thread(myTicket);

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }

    private static void demo01() {
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
