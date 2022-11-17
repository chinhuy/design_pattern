package src.patterns.factory_method;

public class ChicagoStylePizzaStore extends PizzaStore{

  @Override
  public Pizza createPizza(String name) {
    Pizza pizza = null;
    switch(name){
      case "Cheese":
        pizza = new ChicagoStyleCheesePizza();
        break;
      case "Clam":
        pizza = new ChicagoStyleClamPizza();
        break;
      case "Veggie":
        pizza = new ChicagoStyleVeggiePizza();
        break;
      case "Pepperoni":
        pizza = new ChicagoStylePepperoniPizza();
        break;
      default:
        break;
    }
    return pizza;
  }
  
}
