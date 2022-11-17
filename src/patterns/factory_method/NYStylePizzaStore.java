package src.patterns.factory_method;

public class NYStylePizzaStore extends PizzaStore{
  
  @Override
  public Pizza createPizza(String name) {
    Pizza pizza = null;
    switch(name){
      case "Cheese":
        pizza = new NYStyleCheesePizza();
        break;
      case "Clam":
        pizza = new NYStyleClamPizza();
        break;
      case "Veggie":
        pizza = new NYStyleVeggiePizza();
        break;
      case "Pepperoni":
        pizza = new NYStylePepperoniPizza();
        break;
      default:
        break;
    }
    return pizza;
  }
}
