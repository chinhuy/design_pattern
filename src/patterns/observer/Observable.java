package src.patterns.observer;

public interface Observable {
  public void update(float temperature, int windSpeed, int pressure);
}
