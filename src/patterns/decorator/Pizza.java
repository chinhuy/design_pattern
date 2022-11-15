package src.patterns.decorator;

public abstract class Pizza {
  protected String description;
  public abstract double cost();
  public String getDescription() {
    return description;
  }
}
