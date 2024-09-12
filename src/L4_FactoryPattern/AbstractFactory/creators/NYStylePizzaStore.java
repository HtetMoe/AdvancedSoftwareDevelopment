package L4_FactoryPattern.AbstractFactory.creators;


import L4_FactoryPattern.AbstractFactory.CheesePizza;
import L4_FactoryPattern.AbstractFactory.Pizza;
import L4_FactoryPattern.AbstractFactory.factories.PizzaIngredientFactory;
import L4_FactoryPattern.AbstractFactory.PizzaStore;
import L4_FactoryPattern.AbstractFactory.factories.NYPizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }

        // Additional pizza types can be added here

        return pizza;
    }
}
