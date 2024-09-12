package L4_FactoryPattern.AbstractFactory.factories;

import L4_FactoryPattern.AbstractFactory.products.Dough;
import L4_FactoryPattern.AbstractFactory.products.Sauce;

public interface  PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
}
