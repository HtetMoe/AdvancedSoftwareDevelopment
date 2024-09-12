package Labs.Account.observer.subject;

import Labs.Account.observer.concreteObservers.AccountObserver;

public interface Subject {
    void registerObserver(AccountObserver observer);
    void removeObserver(AccountObserver observer);
    void notifyObservers(String message);
}
