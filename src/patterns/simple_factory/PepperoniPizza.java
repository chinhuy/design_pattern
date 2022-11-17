package src.patterns.simple_factory;

public class PepperoniPizza extends Pizza{

  public PepperoniPizza() {
    name = "Pepperoni Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing..." + name);
  }
  
}
