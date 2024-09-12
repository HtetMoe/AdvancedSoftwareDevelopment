package L4_FactoryPattern.AbstractFactory;

import L4_FactoryPattern.AbstractFactory.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        System.out.println("Using ingredients: " + dough + " and " + sauce);
    }
}
