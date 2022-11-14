package src.patterns.observer;

public class ObserverDemo {
  public static void main(String[] args) {
    SimpleSubject simpleSubject = new SimpleSubject();
    SimpleObserver observer1 = new SimpleObserver(simpleSubject);
    SimpleObserver observer2 = new SimpleObserver(simpleSubject);
    simpleSubject.setValue(3);
    simpleSubject.setValue(5);

  }
}
