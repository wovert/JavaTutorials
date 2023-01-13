package com.wovert.javase.interfaces;

interface InterA {
    public default void show() {
        System.out.println("我是A接口中的show方法");
    }
}

class InterAImp implements InterA {
    @Override
    public void show() {
        System.out.println("我是重写后show方法");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        InterAImp i = new InterAImp();
        i.show();
    }
}
