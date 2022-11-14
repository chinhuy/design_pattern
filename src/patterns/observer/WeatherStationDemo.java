package src.patterns.observer;

public class WeatherStationDemo {
  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation();
    UserInterface userInterface = new UserInterface(weatherStation);
    AlertSystem alertSystem = new AlertSystem(weatherStation);
    Logger logger = new Logger(weatherStation);
    weatherStation.setMeasurements(57.5f, 70, 30);

  }
}
