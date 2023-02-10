package com.wovert.javase.designPattern;

/**
 * 策略模式
 */
public class DemoStatege {
    public static void main(String[] args) {
        Duck blackDuck = new BlackDuck("真鸭子");
        blackDuck.setFly(new FlyImpl());
        blackDuck.fly();

        Duck modelDuck = new ModelDuck("模型鸭子");
        modelDuck.setFly(new NotFlyImpl());
        modelDuck.fly();
    }
}

interface Flyable {
    public void fly();
}

class FlyImpl implements Flyable {
    @Override
    public void fly() {
        System.out.println("我飞得老高了~");
    }
}

class NotFlyImpl implements Flyable {
    @Override
    public void fly() {
        System.out.println("我不飞~");
    }
}

abstract class Duck {
    protected String name;
    protected Flyable fly; // 多用组合，少用继承

    public Duck(String name) {
        this.name = name;
    }

    public void setFly(Flyable fly) {
        this.fly = fly;
    }

    public Flyable getFly() {
        return fly;
    }

    public void fly() {
        System.out.println("我是" + name);
        fly.fly();
    }
}

// 真黑鸭子
class BlackDuck extends Duck {

    public BlackDuck(String name) {
        super(name);
    }
}

// 模型鸭子
class ModelDuck extends Duck {

    public ModelDuck(String name) {
        super(name);
    }
}