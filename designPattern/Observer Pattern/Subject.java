/**
 * 主题接口
 */
public interface Subject {
  /**
   * 注册观察者
   * @param o 观察者对象
   */
  public void registerObserver(Observer o);

  /**
   * 移除观察者
   * @param o 观察者对象
   */
  public void removeObserver(Observer o);

  /**
   * 通知所有观察者
   * @return
   */
  public vli notifyObservers();
}