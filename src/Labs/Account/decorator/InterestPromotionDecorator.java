package Labs.Account.decorator;

import Labs.Account.strategy.InterestStrategy;

//Abstract Decorator
public abstract class InterestPromotionDecorator implements InterestStrategy {
    private InterestStrategy decoratedStrategy; // **** composition

    public InterestPromotionDecorator(InterestStrategy strategy) {
        this.decoratedStrategy = strategy; // delegation
    }

    @Override
    public double calculateInterest(double balance) {
        return decoratedStrategy.calculateInterest(balance);
    }
}
