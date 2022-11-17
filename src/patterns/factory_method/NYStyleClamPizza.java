package src.patterns.factory_method;

public class NYStyleClamPizza extends Pizza{

  public NYStyleClamPizza(){
    this.name = "NY Style Clam Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("Preparing...." + name);
  }
  
}
