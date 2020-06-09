package com.wovert.strategy;

/**
 * @author wovert wovert@126.com
 * 赵云
 */

public class Zhaoyun  {

  /**
   * 赵云出场了，根据孔明给他的交代，依次拆开妙计
   */
  public static void main(String[] args) {
    Context context;

    // 往往到吴国的时候拆开一个
    System.out.println("------- 刚刚到吴国的时候拆开第一个--------");

    context = new Context(new BackDoor()); // 拿到妙计
    context.operate(); // 拆开执行
    System.out.println("\n\n\n\n");

    // 刘备乐不思蜀了，拆第二个了
    System.out.println("--------刘备乐不思蜀了，拆第二个--------");
    context = new Context(new GivenGreenLight());
    context.operate(); // 执行了第二个锦囊了
    System.out.println("\n\n\n\n");

    // 孙权的小兵追了，咋办？拆第三个
    System.out.println("--------孙权的小兵追了，咋办？拆第三个--------");
    context = new Context(new BlockEnemy());
    context.operate(); // 损夫人退兵
    System.out.println("\n\n\n\n");


  }
}

