package src.patterns.decorator;

public class ThinCrustPizza extends Pizza{

  public ThinCrustPizza() {
    description = "Thin curst pizza";
  }
  @Override
  public double cost() {
    return 10.5;
  }
  
}
