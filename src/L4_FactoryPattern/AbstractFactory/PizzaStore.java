package L4_FactoryPattern.AbstractFactory;

public abstract class PizzaStore {
    // Factory method: Subclasses will implement this method to create specific pizzas
    protected abstract Pizza createPizza(String type);

    // Method to order a pizza, uses the factory method to create the pizza
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type); // Call to the factory method

        // Common preparation steps for all pizzas
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
