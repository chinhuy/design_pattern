package src.patterns.decorator;

public class ThickCrustPizza extends Pizza{

  public ThickCrustPizza(){
    description = "Thick crust pizza";
  }
  @Override
  public double cost() {
    return 15.5;
  }
  
}
