package src.patterns.decorator;

public class StarbuzzCoffee {
  public static void main(String[] args) {
    Beverage beverage = new HouseBlend();
    beverage = new Milk(beverage);
    beverage = new Mocha(beverage);
    beverage = new Soy(beverage);
    System.out.println("Your order:" + beverage.getDescription());
    System.out.println("Your bill:" + beverage.cost());
  }
}
