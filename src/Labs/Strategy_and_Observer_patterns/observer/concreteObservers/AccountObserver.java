package Labs.Strategy_and_Observer_patterns.observer.concreteObservers;

import Labs.Strategy_and_Observer_patterns.Account;

public interface AccountObserver {
    void update(Account account, String message);
}
