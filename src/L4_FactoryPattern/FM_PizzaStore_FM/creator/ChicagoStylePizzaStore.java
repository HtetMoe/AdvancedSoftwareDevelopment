package L4_FactoryPattern.FM_PizzaStore_FM.creator;

import L4_FactoryPattern.FM_PizzaStore_FM.CheesePizza;
import L4_FactoryPattern.FM_PizzaStore_FM.PepperoniPizza;
import L4_FactoryPattern.FM_PizzaStore_FM.Pizza;
import L4_FactoryPattern.FM_PizzaStore_FM.PizzaStore;

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
