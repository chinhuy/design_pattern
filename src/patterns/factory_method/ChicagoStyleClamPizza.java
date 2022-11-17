package src.patterns.factory_method;

public class ChicagoStyleClamPizza extends Pizza{

  public ChicagoStyleClamPizza(){
    this.name = "Chicago Style Clam Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing...." + name);
  }
  
}
