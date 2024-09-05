package Labs.Strategy_and_Observer_patterns;

import Labs.Strategy_and_Observer_patterns.observer.concreteObservers.AccountObserver;
import Labs.Strategy_and_Observer_patterns.strategy.InterestStrategy;

import java.util.Collection;

public interface AccountService {
    Account createAccount(String accountNumber, String customerName, InterestStrategy interestStrategy);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();

    void deposit (String accountNumber, double amount);
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
    void addInterest();

    // Adds an observer to the service-level observer list
    void addObserver(AccountObserver observer);

    // Removes an observer from the service-level observer list
    void removeObserver(AccountObserver observer);
}
