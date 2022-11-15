package src.patterns.decorator;

public class Olives extends ToppingDecorator{

  public Olives(Pizza pizza){
    this.pizza = pizza;
  }
  @Override
  public String getDescription() {
    return this.pizza.getDescription() + " with Olives";
  }

  @Override
  public double cost() {
    return this.pizza.cost() + 0.8;
  }
  
}
