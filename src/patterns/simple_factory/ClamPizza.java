package src.patterns.simple_factory;

public class ClamPizza extends Pizza{

  public ClamPizza() {
    name = "Clam Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing..." + name);
  }
  
}
