package Labs.Strategy_and_Observer_patterns;

import Labs.Strategy_and_Observer_patterns.observer.concreteObservers.AccountObserver;
import Labs.Strategy_and_Observer_patterns.strategy.InterestStrategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;
	private List<AccountObserver> serviceObservers = new ArrayList<>();

	public AccountServiceImpl(){
		accountDAO = new AccountDAOImpl();
	}

	public Account createAccount(String accountNumber, String customerName, InterestStrategy strategy) {
		Account account = new Account(accountNumber, strategy);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);

		notifyServiceObservers(account, "Account created for " + customerName);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}

	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);

		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	@Override
	public void addInterest() {
		for (Account account : accountDAO.getAccounts()) {
			account.addInterest();
		}
	}

	@Override
	public void addObserver(AccountObserver observer) {
		serviceObservers.add(observer);
		System.out.println("Observer added to service-level observers.");
	}

	@Override
	public void removeObserver(AccountObserver observer) {
		serviceObservers.remove(observer);
		System.out.println("Observer removed from service-level observers.");
	}

	// notifies all service-level observers with a message
	private void notifyServiceObservers(Account account, String message) {
		for (AccountObserver observer : serviceObservers) {
			observer.update(account, message);
			System.out.println("Notified observer with message: " + message);
		}
	}
}
