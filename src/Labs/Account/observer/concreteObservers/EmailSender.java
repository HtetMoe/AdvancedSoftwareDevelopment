package Labs.Account.observer.concreteObservers;

import Labs.Account.Account;

public class EmailSender implements AccountObserver {
    @Override
    public void update(Account account, String message) {
        System.out.println("Email => " + message + " for Account: " + account.getAccountNumber());
    }
}
