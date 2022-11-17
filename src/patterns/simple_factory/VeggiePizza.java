package src.patterns.simple_factory;

public class VeggiePizza extends Pizza{

  public VeggiePizza() {
    name = "Veggie Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing..." + name);
  }
  
}
