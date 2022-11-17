package src.patterns.simple_factory;

public class CheesePizza extends Pizza{

  public CheesePizza(){
    this.name = "Cheese Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing...." + name);
  }
  
}
