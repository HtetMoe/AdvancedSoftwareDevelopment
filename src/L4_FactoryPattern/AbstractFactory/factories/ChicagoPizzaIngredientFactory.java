package L4_FactoryPattern.AbstractFactory.factories;

import L4_FactoryPattern.AbstractFactory.products.Dough;
import L4_FactoryPattern.AbstractFactory.products.PlumTomatoSauce;
import L4_FactoryPattern.AbstractFactory.products.Sauce;
import L4_FactoryPattern.AbstractFactory.products.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
