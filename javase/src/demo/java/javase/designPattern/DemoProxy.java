package demo.java.javase.designPattern;

public class DemoProxy {
    public static void main(String[] args) {
        UserAction user = new UserAction();
        ActionProxy proxy = new ActionProxy(user);
        proxy.doAction();
    }
}

interface Action {
    public void doAction();
}

class UserAction implements Action {
    public void doAction() {
        for (int i=0; i<100; i++) {
            System.out.println(i + "用户开始工作...");
        }
    }
}

class ActionProxy implements Action {
    private Action target; // 被代理的对象

    public ActionProxy(Action target) {
        this.target = target;
    }

    public void doAction() {
        long startTime = System.currentTimeMillis();
        target.doAction();
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime-startTime));
    }
}