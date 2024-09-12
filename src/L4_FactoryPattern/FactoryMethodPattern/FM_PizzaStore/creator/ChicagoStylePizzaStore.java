package L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.creator;

import L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.CheesePizza;
import L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.PepperoniPizza;
import L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.Pizza;
import L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(); // Chicago-style specific CheesePizza
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza(); // Chicago-style specific PepperoniPizza
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
