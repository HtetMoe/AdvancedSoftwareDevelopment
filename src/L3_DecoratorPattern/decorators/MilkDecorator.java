package L3_DecoratorPattern.decorators;

import L3_DecoratorPattern.components.Coffee;

//Concrete Decorators
public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;  // Add milk cost
    }

    @Override
    public String getDescription() {
        return STR."\{super.getDescription()}, milk";
    }
}
