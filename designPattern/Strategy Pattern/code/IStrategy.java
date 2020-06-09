package com.wovert.strategy;

/**
 * @author wovert wovert@126.com
 * 策略接口，这是孔明给赵云的三个锦囊妙计的接口
 *
 */

public interface IStrategy {
  
  // 三个锦囊妙计都是一个可执行的算法

  void operate();
}