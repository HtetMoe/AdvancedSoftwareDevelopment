package L1_StrategyPattern.strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Strategy A executed");
    }
}
