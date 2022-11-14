package src.patterns.observer;

public class Logger implements Observable{

  private WeatherSubject weatherSubject;
  private float temperature;
  private int windSpeed;
  private int pressure;

  public Logger(WeatherSubject weatherSubject) {
    this.weatherSubject = weatherSubject;
    this.weatherSubject.registerObserver(this);
  }

  @Override
  public void update(float temperature, int windSpeed, int pressure) {
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
    logger();
  }
  public void logger() {
    System.out.println("Logger: temperature:" + temperature + ", wind speed: " + windSpeed + ", presure: " + pressure);
  }
  
}
