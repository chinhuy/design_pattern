package src.patterns.observer;

public class UserInterface implements Observable{

  private WeatherSubject weatherSubject;
  private float temperature;
  private int windSpeed;
  private int pressure;

  public UserInterface(WeatherSubject weatherSubject) {
    this.weatherSubject = weatherSubject;
    this.weatherSubject.registerObserver(this);
  }
  @Override
  public void update(float temperature, int windSpeed, int pressure) {
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
    display();
  }
  public void display() {
    System.out.println("UserInterace: temperature:" + temperature + ", wind speed: " + windSpeed + ", presure: " + pressure);
  }

  public void remove() {
    System.out.println("Unsubscribe this weather subject");
    this.weatherSubject.removeObserver(this);
  }
  
}
