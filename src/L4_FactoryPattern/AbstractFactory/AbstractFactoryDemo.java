package L4_FactoryPattern.AbstractFactory;

import L4_FactoryPattern.AbstractFactory.creators.ChicagoStylePizzaStore;
import L4_FactoryPattern.AbstractFactory.creators.NYStylePizzaStore;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
    /*
        - one family (factory)

        - familities ( multiple family) = abstract factory
        - directing call the creating method
     */
}
