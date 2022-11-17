package src.patterns.factory_method;

public class NYStyleVeggiePizza extends Pizza{

  public NYStyleVeggiePizza(){
    this.name = "NY Style Veggie Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing...." + name);
  }
  
}
