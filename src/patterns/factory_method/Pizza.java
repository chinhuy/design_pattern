package src.patterns.factory_method;

public abstract class Pizza {
  protected String name;
  public abstract void prepare();
  public void bake(){
    System.out.println("Baking ....");
  }
  public void cut() {
    System.out.println("Cutting....");
  }
  public void box() {
    System.out.println("Box.....");
  }
  public String getName() {
    return name;
  }

}
