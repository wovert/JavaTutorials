/**
 * 公告板类，实现观察者接口和现实公告板接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Subject weatherData;

  public CurrentConditionsDislay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  /**
   * 更新数据时显示最新数据
   * @param temperature
   * @param humidity
   * @param pressure
   */
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
  }
}