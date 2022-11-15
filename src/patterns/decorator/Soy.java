package src.patterns.decorator;

public class Soy extends CondimentDecorator{

  private Beverage beverage;

  public Soy(Beverage beverage){
    this.beverage = beverage;
    this.description = this.beverage.getDescription() + " with Soy";
  }
  @Override
  public float cost() {
    return this.beverage.cost() + 0.25f;
  }
  @Override
  public String getDescription() {
    return description;
  }
  
}
