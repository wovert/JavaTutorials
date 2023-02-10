package com.wovert.javase.designPattern;

/**
 * 简单工厂模式
 */
public class DemoFactory {
    public static void main(String[] args) {
        // 耦合：使用者直接使用了具体的类，表示当前类依赖该具体类，这个具体类发生变化时，使用者将受到影响
        TCLPhone phone = new TCLPhone();
        phone.working();


        // 工厂模式
        Work work = Factory.getWork("tv");
        work.working();
    }
}

// 工厂类
class Factory {
    public static Work getWork(String product) {
        Work work;
        switch (product) {
            case "phone":
                work = new TCLPhone();
                break;
            case "tv":
                work = new TCLTV();
                break;
            default:
                work = null;
        }
        return work;
    }
}

interface Work {
    public void working();
}

class TCLPhone implements Work {
    @Override
    public void working() {
        System.out.println("手机已经开机完毕，可以使用了");
    }
}

class TCLTV implements Work {

    @Override
    public void working() {
        System.out.println("电视机已打开，正在播放~");
    }
}
