package L1_StrategyPattern;

import L1_StrategyPattern.strategy.Strategy;

public class Context {
    private Strategy strategy; // Composition

    public Context(Strategy strategy) { // The Strategy type is polymorphic
        this.strategy = strategy; // delegation
    }

    //interchangeable strategy at run-time
    public void setStrategy(Strategy strategy) {// Polymorphism is applied here
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute(); // Polymorphism allows calling the correct execute method
    }
}
