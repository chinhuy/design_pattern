package src.patterns.strategy;

public class DuckDemoApp {
  public static void main(String[] args) {
    Duck duck;
    FlyBehavior flyWithWings;
    QuackBehavior quackBehavior;
    //MallardDuck
    duck = new MallardDuck();
    flyWithWings = new FlyWithWings();
    quackBehavior = new QuackQuack();
    duck.setFlyBehavior(flyWithWings);
    duck.setQuackBehavior(quackBehavior);
    duck.display();
    duck.swim();
    duck.performFly();
    duck.performQuack();
    //redhead duck
    duck = new RedheadDuck();
    flyWithWings = new FlyWithWings();
    quackBehavior = new QuackQuack();
    duck.setFlyBehavior(flyWithWings);
    duck.setQuackBehavior(quackBehavior);
    duck.display();
    duck.swim();
    duck.performFly();
    duck.performQuack();

    //rubber duck
    duck = new RubberDuck();
    flyWithWings = new FlyNoWay();
    quackBehavior = new Squeak();
    duck.setFlyBehavior(flyWithWings);
    duck.setQuackBehavior(quackBehavior);
    duck.display();
    duck.swim();
    duck.performFly();
    duck.performQuack();

    //decoy duck
    duck = new DecoyDuck();
    flyWithWings = new FlyNoWay();
    quackBehavior = new QuackNoway();
    duck.setFlyBehavior(flyWithWings);
    duck.setQuackBehavior(quackBehavior);
    duck.display();
    duck.swim();
    duck.performFly();
    duck.performQuack();
    
  }
  
}
