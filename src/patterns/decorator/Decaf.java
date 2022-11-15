package src.patterns.decorator;

public class Decaf extends Beverage{

  public Decaf(){
    this.description = "Decaf coffee";
  }
  @Override
  public float cost() {
    return 3.5f;
  }

}
