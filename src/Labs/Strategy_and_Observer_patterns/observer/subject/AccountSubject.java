package Labs.Strategy_and_Observer_patterns.observer.subject;

import Labs.Strategy_and_Observer_patterns.Account;
import Labs.Strategy_and_Observer_patterns.observer.concreteObservers.AccountObserver;

import java.util.ArrayList;
import java.util.List;

public class AccountSubject implements Subject {
    private List<AccountObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(AccountObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(AccountObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (AccountObserver observer : observers) {
            observer.update((Account) this, message);  // Assuming casting to Account for observer compatibility
        }
    }
}
