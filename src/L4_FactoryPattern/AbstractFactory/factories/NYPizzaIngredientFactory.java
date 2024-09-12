package L4_FactoryPattern.AbstractFactory.factories;

import L4_FactoryPattern.AbstractFactory.products.Dough;
import L4_FactoryPattern.AbstractFactory.products.MarinaraSauce;
import L4_FactoryPattern.AbstractFactory.products.Sauce;
import L4_FactoryPattern.AbstractFactory.products.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
