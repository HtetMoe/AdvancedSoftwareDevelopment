package Labs.Strategy_and_Observer_patterns.observer.subject;

import Labs.Strategy_and_Observer_patterns.observer.concreteObservers.AccountObserver;

public interface Subject {
    void registerObserver(AccountObserver observer);
    void removeObserver(AccountObserver observer);
    void notifyObservers(String message);
}
