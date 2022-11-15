package src.patterns.decorator;

public class DarkRoast extends Beverage{

  public DarkRoast(){
    this.description = "DarkRoast coffee";
  }
  @Override
  public float cost() {
    return 2.5f;
  }

}
