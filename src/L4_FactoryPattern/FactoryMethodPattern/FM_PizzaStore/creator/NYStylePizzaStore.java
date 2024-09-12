package L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.creator;

import L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.CheesePizza;
import L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.PepperoniPizza;
import L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.Pizza;
import L4_FactoryPattern.FactoryMethodPattern.FM_PizzaStore.PizzaStore;

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
