package Labs.Account.observer.concreteObservers;

import Labs.Account.Account;

public class SMSSender implements AccountObserver {
    @Override
    public void update(Account account, String message) {
        System.out.println("SMS => " + message + " for Account: " + account.getAccountNumber());
    }
}
