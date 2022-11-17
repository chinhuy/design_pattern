package src.patterns.factory_method;

public class ChicagoStyleCheesePizza extends Pizza{

  public ChicagoStyleCheesePizza(){
    this.name = "Chicago Style Cheese Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing...." + name);
  }
  
}
