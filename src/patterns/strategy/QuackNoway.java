package src.patterns.strategy;

public class QuackNoway implements QuackBehavior{
  public void quack() {
    System.out.println("I could not quack or squeak!");
  }
}
