package src.patterns.decorator;

public class HouseBlend extends Beverage{

  public HouseBlend(){
    this.description = "HouseBlend coffee";
  }
  @Override
  public float cost() {
    return 1.5f;
  }
}
