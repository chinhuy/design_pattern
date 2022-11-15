package src.patterns.decorator;

public class Milk extends CondimentDecorator{

  private Beverage beverage;

  public Milk(Beverage beverage){
    this.beverage = beverage;
    this.description = this.beverage.getDescription() + " with Milk";
  }
  @Override
  public float cost() {
    return this.beverage.cost() + 0.10f;
  }
  @Override
  public String getDescription() {
    return description;
  }
  
}
