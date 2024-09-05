package Labs.Strategy_and_Observer_patterns;
import Labs.Strategy_and_Observer_patterns.observer.subject.AccountSubject;
import Labs.Strategy_and_Observer_patterns.strategy.InterestStrategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Account extends AccountSubject {
	//strategy pattern
	private InterestStrategy interestStrategy; // composition

	private Customer customer;
	private String accountNumber;
	private List<AccountEntry> entryList = new ArrayList<AccountEntry>();

	public Account(String accountNumber, InterestStrategy interestStrategy) {
		this.accountNumber = accountNumber;
		this.interestStrategy = interestStrategy;
	}

	//can change the strategy
	public void setInterestStrategy(InterestStrategy interestStrategy) {
		this.interestStrategy = interestStrategy; //delegation
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		double balance = 0;
		for (AccountEntry entry : entryList) {
			balance += entry.getAmount();
		}

		double interest = interestStrategy.calculateInterest(balance);
		balance += interest;
		notifyObservers("Interest added: " + interest);

		return balance;
	}

	public void deposit(double amount) {
		AccountEntry entry = new AccountEntry(amount, "deposit", "", "");
		notifyObservers("Deposited: " + amount);
		entryList.add(entry);
	}

	public void withdraw(double amount) {
		AccountEntry entry = new AccountEntry(-amount, "withdraw", "", "");
		notifyObservers("Withdrawn: " + amount);
		entryList.add(entry);
	}

	private void addEntry(AccountEntry entry) {
		entryList.add(entry);
	}

	public void transferFunds(Account toAccount, double amount, String description) {
		AccountEntry fromEntry = new AccountEntry(-amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		AccountEntry toEntry = new AccountEntry(amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		
		entryList.add(fromEntry);
		toAccount.addEntry(toEntry);
		notifyObservers("Transferred: " + amount + " from account " + this.accountNumber
				+ " to account " + toAccount.getAccountNumber() + ". Description: " + description);
	}

	//strategy pattern
	public double addInterest() {
		if (interestStrategy != null) {
			double interest = interestStrategy.calculateInterest(getBalance());
			notifyObservers("Interest added: " + interest + " to account " + accountNumber);
			return interest;
		}
		return 0;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Collection<AccountEntry> getEntryList() {
		return entryList;
	}
}
