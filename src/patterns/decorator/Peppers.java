package src.patterns.decorator;

public class Peppers extends ToppingDecorator{

  public Peppers(Pizza pizza){
    this.pizza = pizza;
  }
  @Override
  public String getDescription() {
    return this.pizza.getDescription() + " with Peppers";
  }

  @Override
  public double cost() {
    return this.pizza.cost() + 0.7;
  }
  
}
