package src.patterns.iterator;

public class MenuItem {
  private String name;
  private double price;
  private String unit;
  public MenuItem(String name, String unit, double price){
    this.name = name;
    this.unit = unit;
    this.price = price;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public double getPrice(){
    return price;
  }
  public void setUnit(String unit){
    this.unit = unit;
  }
  public String getUnit() {
    return unit;
  }
  public String toString(){
    return name + " " + unit + " " + price;
  }
}
