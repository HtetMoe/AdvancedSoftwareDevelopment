package Labs.Strategy_and_Observer_patterns.strategy;

public class SavingsInterestStrategy implements InterestStrategy{

    @Override
    public double calculateInterest(double balance) {
        if (balance < 1000) {
            return balance * 0.01;
        } else if (balance < 5000) {
            return balance * 0.02;
        } else {
            return balance * 0.04;
        }
    }
}
