package Labs.Account.decorator;

import Labs.Account.strategy.InterestStrategy;

public class P2Decorator extends InterestPromotionDecorator{

    public P2Decorator(InterestStrategy strategy) {
        super(strategy);
    }

    @Override
    public double calculateInterest(double balance) {
        return super.calculateInterest(balance) + balance * 0.02; // adds 2% interest
    }
}
