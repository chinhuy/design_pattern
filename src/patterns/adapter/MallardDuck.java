package src.patterns.adapter;

public class MallardDuck implements Duck{

  public MallardDuck() {
    System.out.println("I am a mallard duck!");
  }

  @Override
  public void fly() {
    System.out.println("I can fly!!!");
    
  }

  @Override
  public void quack() {
    System.out.println("Quack! Quack!");
  }
  
}
