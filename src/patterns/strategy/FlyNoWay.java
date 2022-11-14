package src.patterns.strategy;

public class FlyNoWay implements FlyBehavior{
  public void fly() {
    System.out.println("I could not fly.");
  }
}
