package src.patterns.factory_method;

public class FactoryMethodApp {
  public static void main(String[] args) {
    PizzaStore pzStore;
    Pizza pizza;
    
    //Chicago style
    pzStore = new ChicagoStylePizzaStore();
    pizza = pzStore.orderPizza("Cheese");
    System.out.println("Delivery pizza " + pizza.getName());

    //NY Style
    pzStore = new NYStylePizzaStore();
    pizza = pzStore.orderPizza("Veggie");
    System.out.println("Delivery pizza " + pizza.getName());

  }
}
