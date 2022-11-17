package src.patterns.factory_method;

public class ChicagoStyleVeggiePizza extends Pizza{

  public ChicagoStyleVeggiePizza(){
    this.name = "Chicago Style Veggie Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing...." + name);
  }
  
}
