package com.wovert.javase.innerClass;

interface IA {
    void run();
}

interface IB {
    void run();
    void stop();
}

class IAImpl implements IA {

    @Override
    public void run() {
        System.out.println("IAImpl 重写的show方法");
    }
}


class Outer {
    String name = "outer member name";

    // 成员内部类
    class Inner {
        String name = "inner member name";

        void print() {
            System.out.println("this.name=" + this.name);
            System.out.println("Outer.this.name=" + Outer.this.name);
        }
    }

    // 静态内部类
    static class staticInner {
        String name = "static inner member name";
        void print() {
            System.out.println("this.name=" + this.name);
        }
        static void method() {
            System.out.println("staticInner static method");
        }
    }
    void test(IA a) {
        a.run();
    }
}

public class DemoInner {
    public static void main(String[] args) {
        // 创建内部类格式
        Outer.Inner i = new Outer().new Inner();
        i.print();

        // 创建静态内部类格式
        Outer.staticInner si = new Outer.staticInner();
        si.print();

        Outer o = new Outer();
        // 匿名内部类
        o.test(new IA() {
            int age = 18;
            @Override
            public void run() {
                System.out.println("this.age=" + this.age);
            }
        });

        // Lambda 表达式 对匿名内部类进行优化
        o.test(() -> {
            System.out.println("IA run method....");
        });

        Outer.staticInner.method();

        DemoInner di = new DemoInner();
        di.method();

        IAImpl ia = new IAImpl();
        ia.run();

        // 匿名内部类： 将继承\实现，方法重写，创建对象，一部到位
        new IA() {

            @Override
            public void run() {
                System.out.println("匿名内部类方法~");
            }
        }.run();

        IB ib = new IB() {

            @Override
            public void run() {
                System.out.println("IB run...");
            }

            @Override
            public void stop() {
                System.out.println("IB stop...");
            }
        };
        ib.run();
        ib.stop();
    }

    public void method() {
        // 局部内部类
        class Inner {
            public void show() {
                System.out.println("show...");
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
