package Labs.Account.observer.concreteObservers;

import Labs.Account.Account;

public interface AccountObserver {
    void update(Account account, String message);
}
