package L3_DecoratorPattern;

import L3_DecoratorPattern.components.Coffee;
import L3_DecoratorPattern.components.SimpleCoffee;
import L3_DecoratorPattern.decorators.MilkDecorator;
import L3_DecoratorPattern.decorators.SugarDecorator;

public class MainDecoratorPattern {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " costs $" + simpleCoffee.getCost());

        // Add milk to the coffee
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " costs $" + milkCoffee.getCost());

        // Add sugar to the milk coffee
        Coffee milkAndSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkAndSugarCoffee.getDescription() + " costs $" + milkAndSugarCoffee.getCost());
    }
}
/*
    => Basic Coffee: Starts with SimpleCoffee.

    => Adding Features: Decorators (MilkDecorator, SugarDecorator)
    wrap the SimpleCoffee object, dynamically adding new behaviors.

    => Flexible Combinations: You can combine multiple decorators in any order,
     allowing you to customize objects flexibly without modifying their core structure.
 */