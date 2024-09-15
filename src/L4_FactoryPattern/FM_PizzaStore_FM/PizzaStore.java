package L4_FactoryPattern.FM_PizzaStore_FM;

//Define the Creator (PizzaStore) Abstract Class
public abstract class PizzaStore {
    // Factory method
    protected abstract Pizza createPizza(String type);

    // Order method uses the factory method
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type); // Factory method is called here

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
