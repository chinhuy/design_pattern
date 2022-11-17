package src.patterns.simple_factory;

public class SimplePizzaFactory {
  public static Pizza createPizza(String name) {
    Pizza pizza = null;
    switch(name){
      case "Cheese":
        pizza = new CheesePizza();
        break;
      case "Clam":
        pizza = new ClamPizza();
        break;
      case "Veggie":
        pizza = new VeggiePizza();
        break;
      case "Pepperoni":
        pizza = new PepperoniPizza();
        break;
      default:
        break;
    }
    return pizza;
  }
}
