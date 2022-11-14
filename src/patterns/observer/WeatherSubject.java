package src.patterns.observer;

public interface WeatherSubject {
  public void registerObserver(Observable observer);
  public void removeObserver(Observable observable);
  public void notifyObservers();
}
