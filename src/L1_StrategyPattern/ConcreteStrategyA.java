package L1_StrategyPattern;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void execute() {
        System.out.println("Strategy A executed");
    }
}
