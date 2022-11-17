package src.patterns.factory_method;

public class NYStylePepperoniPizza extends Pizza{

  public NYStylePepperoniPizza(){
    this.name = "NY Style Pepperoni Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing...." + name);
  }
  
}
