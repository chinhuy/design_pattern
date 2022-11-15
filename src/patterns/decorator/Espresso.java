package src.patterns.decorator;

public class Espresso extends Beverage{

  public Espresso(){
    this.description = "Espresso coffee";
  }
  @Override
  public float cost() {
    return 5.f;
  }
}
