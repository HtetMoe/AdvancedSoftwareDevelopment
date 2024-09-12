package Labs.Account.decorator;

import Labs.Account.strategy.InterestStrategy;

public class P3Decorator extends InterestPromotionDecorator{

    public P3Decorator(InterestStrategy strategy) {
        super(strategy);
    }

    @Override
    public double calculateInterest(double balance) {
        return super.calculateInterest(balance) + balance * 0.03; // adds 3% interest
    }
}
