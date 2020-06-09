package com.wovert.strategy;

/**
 * @author wovert wovert@126.com
 * 计谋有了，哪还要有锦囊
 */

public class Context  {
  // 构造函数，使用迷哦啊及

  private IStrategy strategy;

  public Context(IStrategy strategy) {
    this.strategy = strategy;
  }

  /**
   * 使用计谋了，看我出招了
   */
  public void operate() {
    this.strategy.operate();
  }
}

