package Labs.Account.observer.concreteObservers;
import Labs.Account.Account;

public class Logger implements AccountObserver {
    @Override
    public void update(Account account, String message) {
        System.out.println("Logger => " + message + " for Account: " + account.getAccountNumber());
    }
}
