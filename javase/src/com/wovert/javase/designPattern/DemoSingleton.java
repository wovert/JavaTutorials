package com.wovert.javase.designPattern;

public class DemoSingleton {
    public static void main(String[] args) {
        Singletone s = Singletone.getSingletone();
        System.out.println(s);

        Singletone s2 = Singletone.getSingletone();
        System.out.println(s2);
    }

}


class Singletone {
    private static Singletone singletone;
    private Singletone() {}

    public static Singletone getSingletone() {
        if (singletone == null) {
            singletone = new Singletone();
        }
        return singletone;
    }
}