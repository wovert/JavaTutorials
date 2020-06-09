/**
 * 实现 Subject 接口
 */
public class WeatherData implements Subject {
  private ArrayList observres; // 记录观察者
  private float temperature; // 温度
  private float humidity; // 湿度
  private float pressure; // 气压

  /**
   * 构造函数：初始化记录观察者
   */
  public WeatherData() {
    observers = new ArrayList();
  }

  /**
   * 注册观察者
   * @param o 要注册的观察者对象
   */
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  /**
   * 删除观察者
   * @param o 要删除的观察者对象
   */
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if(i >=0 ) {
      observers.remove(i);
    }
  }

  /**
   * 通知所有观察者对象
   */
  public void notifyObservers() {
    for (int i=0; i<observers.size(); ) {
      Observer observer = (Observer)observers.get(i);
      observer.update(temperature, humidity, pressure);
    }
  }

  /**
   * 从气象站得到更新观测值时，我们通知观察者
   */
  public void measurementsChanged() {
    notifyObservers();
  }

  /**
   * 设置观测值
   * @param temperature 温度
   * @param humidity 湿度
   * @param pressure 气压
   */
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidiy = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

}