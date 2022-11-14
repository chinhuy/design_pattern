package src.patterns.observer;

import java.util.ArrayList;

public class SimpleSubject implements Subject{

  private ArrayList<Observer> observers;
  private int value;

  public SimpleSubject(){
    this.observers = new ArrayList<>();
  }
  public void setValue(int value){
    this.value = value;
    notifyObservers();
  }
  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(value);
    }
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    if(observers.indexOf(observer) != -1){
      observers.remove(observer);
    }
  }
}
