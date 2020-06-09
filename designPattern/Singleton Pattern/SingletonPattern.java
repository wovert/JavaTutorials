package com.wovert.singleton;

public class SingletonPattern {
  private static final SingletonPattern singletonPattern = new SingletonPattern();

  private SingletonPattern(){}

  public synchronized static SingletonPattern getInstance() {
    return singletonPattern;
  }
}

class SingletonPatternDemo {
  public static void main(String[] args) {
    SingletonPattern o1 = SingletonPattern.getInstance();
    SingletonPattern o2 = SingletonPattern.getInstance();
    SingletonPattern o3 = SingletonPattern.getInstance();

    System.out.println(o1);
    System.out.println(o2);
    System.out.println(o3);
  }
}