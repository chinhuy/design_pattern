package src.patterns.factory_method;

public class ChicagoStylePepperoniPizza extends Pizza{

  public ChicagoStylePepperoniPizza(){
    this.name = "Chicago Style Pepperoni Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing...." + name);
  }
  
}
