package src.patterns.simple_factory;

public class PizzaStore {
  public static void main(String[] args) {
    Pizza pizza = orderPizza();
    pizza.cut();
    pizza.box();
  }
  public static Pizza orderPizza() {
    Pizza pizza = SimplePizzaFactory.createPizza("Cheese");
    pizza.prepare();
    pizza.bake();
    return pizza;
  }
}
