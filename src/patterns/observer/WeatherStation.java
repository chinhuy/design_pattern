package src.patterns.observer;

import java.util.ArrayList;

public class WeatherStation implements WeatherSubject{

  private ArrayList<Observable> observers = null;
  private float temperature = 0;
  private int windSpeed = 0;
  private int pressure = 0;
  public WeatherStation() {
    observers = new ArrayList<>();
  }
  public void setMeasurements(float temperature, int windSpeed, int pressure){
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.pressure = pressure;
    notifyObservers();
  }
  
  @Override
  public void notifyObservers() {
    for (Observable observer : observers) {
      observer.update(temperature, windSpeed, pressure);
    }
  }

  @Override
  public void registerObserver(Observable observer) {
    observers.add(observer);
    
  }

  @Override
  public void removeObserver(Observable observer) {
    if(observers.indexOf(observer) != -1){
      observers.remove(observer);
    }
    
  }
  
}
