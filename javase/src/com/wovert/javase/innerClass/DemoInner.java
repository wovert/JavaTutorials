package com.wovert.javase.innerClass;

interface IA {
    void run();
}

class Outer {
    String name = "outer member name";

    class Inner {
        String name = "inner member name";

        void print() {
            System.out.println("this.name=" + this.name);
            System.out.println("Outer.this.name=" + Outer.this.name);
        }
    }

    static class staticInner {
        String name = "static inner member name";
        void print() {
            System.out.println("this.name=" + this.name);
        }
    }
    void test(IA a) {
        a.run();
    }
}

public class DemoInner {
    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner();
        i.print();

        Outer.staticInner si = new Outer.staticInner();
        si.print();

        Outer o = new Outer();
        o.test(new IA() {
            int age = 18;
            @Override
            public void run() {
                System.out.println("this.age=" + this.age);
            }
        });
    }
}
