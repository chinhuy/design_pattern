package src.patterns.decorator;

public class Mocha extends CondimentDecorator{

  private Beverage beverage;

  public Mocha(Beverage beverage){
    this.beverage = beverage;
    this.description = this.beverage.getDescription() + " with Mocha";
  }
  @Override
  public float cost() {
    return this.beverage.cost() + 0.30f;
  }
  @Override
  public String getDescription() {
    return description;
  }
  
}
