/**
 * 观察者接口
 */
public interface Observer {
  /**
   * 所有观察者要实现的方法
   * @param temp 温度
   * @param humidity 湿度
   * @param pressure 气压
   */
  public void update(float temp, float humidity, float pressure);
}