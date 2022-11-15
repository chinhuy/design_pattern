package src.patterns.decorator;

public class PizzaStore {
  public static void main(String[] args) {
    Pizza pizza = new ThickCrustPizza();
    pizza = new Cheese(pizza);
    pizza = new Peppers(pizza);
    System.out.println("Your order: " + pizza.getDescription());
    System.out.println("Your bill: " + pizza.cost() + "$");
  }
}
