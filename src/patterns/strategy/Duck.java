package src.patterns.strategy;

abstract class Duck {
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;
  
  abstract public void display();
  public void swim() {
    System.out.println("I can swim!");
  }

  public void setFlyBehavior(FlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }
  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
  public void performFly() {
    flyBehavior.fly();
  }
  public void performQuack() {
    quackBehavior.quack();
  }

}
