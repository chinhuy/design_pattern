package src.patterns.decorator;

public class Cheese extends ToppingDecorator{

  
  public Cheese(Pizza pizza){
    this.pizza = pizza;
  }
  @Override
  public String getDescription() {
    return this.pizza.getDescription() + " with Cheese";
  }

  @Override
  public double cost() {
    return this.pizza.cost() + 0.5;
  }
  
}
