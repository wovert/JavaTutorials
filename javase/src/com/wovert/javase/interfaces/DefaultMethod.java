package com.wovert.javase.interfaces;

interface InterA {
    // JDK8 默认方法（不是抽象方法，不强制被重写；可以重写，但是去掉 default 关键字）：解决接口升级问题
    // 实现了多个接口，多个接口中存在相同的方法声明，子类必须重写方法
    public default void show() {
        System.out.println("我是A接口中的show方法");
    }
}

class InterAImp implements InterA {
    private void priMethod() {
        System.out.println("接口私有方法");
    }
    @Override
    public void show() {
        priMethod();
        System.out.println("我是重写后show方法");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        InterAImp i = new InterAImp();
        i.show();
    }
}
