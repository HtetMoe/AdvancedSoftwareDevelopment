package Labs.Strategy_and_Observer_patterns.observer.concreteObservers;

import Labs.Strategy_and_Observer_patterns.Account;

public class SMSSender implements AccountObserver {
    @Override
    public void update(Account account, String message) {
        System.out.println("SMS => " + message + " for Account: " + account.getAccountNumber());
    }
}
