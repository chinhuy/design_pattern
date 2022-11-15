package src.patterns.decorator;

public abstract class Beverage {
  protected String description;
  public abstract float cost();
  public String getDescription(){
    return description;
  }
}
