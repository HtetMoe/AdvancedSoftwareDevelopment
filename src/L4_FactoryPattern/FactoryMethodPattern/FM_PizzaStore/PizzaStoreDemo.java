package L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore;

import L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.creator.ChicagoStylePizzaStore;
import L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.creator.NYStylePizzaStore;

public class PizzaStoreDemo {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Moe ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Htet ordered a " + pizza.getName() + "\n");
    }
}
