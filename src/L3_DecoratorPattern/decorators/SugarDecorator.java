package L3_DecoratorPattern.decorators;

import L3_DecoratorPattern.components.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;  // Add sugar cost
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }
}
