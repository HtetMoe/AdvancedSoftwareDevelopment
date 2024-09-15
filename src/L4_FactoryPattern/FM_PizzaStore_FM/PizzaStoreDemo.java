package L4_FactoryPattern.FM_PizzaStore_FM;

import L4_FactoryPattern.FM_PizzaStore_FM.creator.ChicagoStylePizzaStore;
import L4_FactoryPattern.FM_PizzaStore_FM.creator.NYStylePizzaStore;

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
