package src.patterns.decorator;

public class Whip extends CondimentDecorator{

  private Beverage beverage;

  public Whip(Beverage beverage){
    this.beverage = beverage;
    this.description = this.beverage.getDescription() + " with Whip";
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
