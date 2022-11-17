package src.patterns.factory_method;

public class NYStyleCheesePizza extends Pizza{

  public NYStyleCheesePizza(){
    this.name = "NY Style Cheese Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing...." + name);
  }
  
}
