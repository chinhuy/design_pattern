package src.patterns.observer;

public class AlertSystem implements Observable{

  private WeatherSubject weatherSubject;
  private float temperature;
  private int windSpeed;
  private int pressure;

  public AlertSystem(WeatherSubject weatherSubject) {
    this.weatherSubject = weatherSubject;
    this.weatherSubject.registerObserver(this);
  }

  @Override
  public void update(float temperature, int windSpeed, int pressure) {
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
    alert();
  }
  public void alert() {
    System.out.println("AlertSystem: temperature:" + temperature + ", wind speed: " + windSpeed + ", presure: " + pressure);
  }
  
}
