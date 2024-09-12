package Labs.Account.decorator;

import Labs.Account.strategy.InterestStrategy;


public class P1Decorator extends InterestPromotionDecorator {

    public P1Decorator(InterestStrategy strategy) {
        super(strategy);
    }

    @Override
    public double calculateInterest(double balance) {
        return super.calculateInterest(balance) + balance * 0.01; //add 1% interest
    }
}
