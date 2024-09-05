package Labs.Strategy_and_Observer_patterns.strategy;

public class CheckingsInterestStrategy implements InterestStrategy{
    @Override
    public double calculateInterest(double balance) {
        if (balance < 1000) {
            return balance * 0.015;
        } else {
            return balance * 0.025;
        }
    }
}
