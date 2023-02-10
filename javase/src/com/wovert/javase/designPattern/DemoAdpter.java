package com.wovert.javase.designPattern;

public class DemoAdpter {
    public static void main(String[] args) {
        PowerA pa = new PowerAImpl();
        work(pa);

        PowerB pb = new PowerBImpl();
//        work(pa);


        // 使用适配器
        Adapter adapter = new Adapter(pb);
        work(adapter);
    }

    public static void work(PowerA a) {
        System.out.println("正在连接...");
        a.insert();
        System.out.println("工作结束");
    }
}

// 适配器
class Adapter implements PowerA {
    private PowerB b;
    public Adapter(PowerB b) {
        this.b = b;
    }
    public void insert() {
        b.connect();
    }
}

interface PowerA {
    public void insert();
}
interface PowerB {
    public void connect();
}

class PowerBImpl implements PowerB {
    public void connect() {
        System.out.println("电源B开始工作");
    }
}

class PowerAImpl implements PowerA {
    public void insert() {
        System.out.println("电源A开始工作");
    }
}