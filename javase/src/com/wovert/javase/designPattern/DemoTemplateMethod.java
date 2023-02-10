package com.wovert.javase.designPattern;

/**
 * 设计模式：模板方式模式
 */

public class DemoTemplateMethod {
    public static void main(String[] args) {
        Games game = new Girl();
        game.play();
    }
}

abstract class Games {
    public void play() {
        System.out.println("游戏开始，把手背到后面，出拳");

        System.out.println("结果：");
        if (result()) {
            System.out.println("恭喜你，赢了");
        } else {
            System.out.println("不好意思，你输了");
        }
    }
    public abstract boolean result();
}

class Girl extends Games {

    @Override
    public boolean result() {
        java.util.Random r = new java.util.Random();
        return r.nextBoolean();
    }
}

class ModeGirl extends Games {

    @Override
    public boolean result() {
        return false;
    }
}




