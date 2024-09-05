package L3_DecoratorPattern.components;

//Concrete Component
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.0;  // Basic coffee cost
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
