package L4_FactoryPattern.FM_PizzaStore_FM.creator;

import L4_FactoryPattern.FM_PizzaStore_FM.CheesePizza;
import L4_FactoryPattern.FM_PizzaStore_FM.PepperoniPizza;
import L4_FactoryPattern.FM_PizzaStore_FM.Pizza;
import L4_FactoryPattern.FM_PizzaStore_FM.PizzaStore;

//Implement Concrete Creators (NYStylePizzaStore, ChicagoStylePizzaStore):
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(); // NY-style specific CheesePizza
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza(); // NY-style specific PepperoniPizza
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
