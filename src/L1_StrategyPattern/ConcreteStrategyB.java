package L1_StrategyPattern;

public class ConcreteStrategyB implements Strategy{
    @Override
    public void execute() {
        System.out.println("Strategy B executed");
    }
}
