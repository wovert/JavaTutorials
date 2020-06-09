package com.wovert.strategy;

/**
 * @author wovert wovert@126.com
 * 求吴国太开个绿灯
 */

public class GivenGreenLight implements IStrategy {
  public void operate() {
    System.out.println("求吴国太开个绿灯，放行！");
  }
}