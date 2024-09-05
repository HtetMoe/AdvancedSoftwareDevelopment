package Labs.Strategy_and_Observer_patterns;

import Labs.Strategy_and_Observer_patterns.observer.concreteObservers.EmailSender;
import Labs.Strategy_and_Observer_patterns.observer.concreteObservers.Logger;
import Labs.Strategy_and_Observer_patterns.observer.concreteObservers.SMSSender;
import Labs.Strategy_and_Observer_patterns.strategy.CheckingsInterestStrategy;
import Labs.Strategy_and_Observer_patterns.strategy.SavingsInterestStrategy;

public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		// create observers for account activities
		Logger logger = new Logger();
		SMSSender smsSender = new SMSSender();	
		EmailSender emailSender = new EmailSender();

		// add the EmailSender observer to AccountService for account creation events
		accountService.addObserver(emailSender);

		// create 2 accounts;
		accountService.createAccount("1263862", "Frank Brown", new SavingsInterestStrategy());
		accountService.createAccount("4253892", "John Doe", new CheckingsInterestStrategy());

		// Add logger and SMS sender observers to both accounts
		accountService.addObserver(logger);
		accountService.addObserver(smsSender);

		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);

		// use account 2;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");

		// show balances
		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			// Display the interest added
			double interest = account.addInterest();
			System.out.printf("%30s%30s%20.2f\n", "", "Interest rate", interest);

			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

}
