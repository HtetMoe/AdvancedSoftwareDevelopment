package L1_StrategyPattern;

import L1_StrategyPattern.strategy.ConcreteStrategyA;
import L1_StrategyPattern.strategy.ConcreteStrategyB;
import L1_StrategyPattern.strategy.Strategy;

public class Main {
    public static void main(String[] args) {

        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();

        //select which strategy to use
        Context context = new Context(strategyA);
        context.executeStrategy(); // Output: Strategy A executed

        context.setStrategy(strategyB); // interchangeable strategy at run-time
        context.executeStrategy(); // Output: Strategy B executed
    }
}
