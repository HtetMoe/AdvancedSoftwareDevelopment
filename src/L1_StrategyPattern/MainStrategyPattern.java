package L1_StrategyPattern;

public class MainStrategyPattern {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy(); // Output: Strategy A executed

        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy(); // Output: Strategy B executed
    }
}
