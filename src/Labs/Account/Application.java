package Labs.Account;

import L5_CommandPattern.command.Command;
import Labs.Account.command.command.DepositCommand;
import Labs.Account.command.command.TransferFundsCommand;
import Labs.Account.command.command.WithdrawCommand;
import Labs.Account.command.invoker.CommandManager;
import Labs.Account.decorator.P1Decorator;
import Labs.Account.decorator.P2Decorator;
import Labs.Account.decorator.P3Decorator;
import Labs.Account.observer.concreteObservers.EmailSender;
import Labs.Account.observer.concreteObservers.Logger;
import Labs.Account.observer.concreteObservers.SMSSender;
import Labs.Account.strategy.CheckingsInterestStrategy;
import Labs.Account.strategy.InterestStrategy;
import Labs.Account.strategy.SavingsInterestStrategy;

public class Application {
	public static void main(String[] args) {
		String environment = "test"; // "production"
		AccountService accountService   = new AccountServiceImpl(environment);
		CustomerService customerService = new CustomerServiceImpl(environment);

		//command manager
		CommandManager commandManager = new CommandManager();

		// create observers for account activities
		Logger logger = new Logger();
		SMSSender smsSender = new SMSSender();	
		EmailSender emailSender = new EmailSender();

		// add the EmailSender observer to AccountService for account creation events
		accountService.addObserver(emailSender);

		//Checking and Savings strategies
		InterestStrategy savingsStrategy   = new SavingsInterestStrategy();
		InterestStrategy checkingsStrategy = new CheckingsInterestStrategy();

        // create 2 accounts; ( previous code)
//		accountService.createAccount("1263862", "Frank Brown", savingsStrategy);
//		accountService.createAccount("4253892", "John Doe", checkingsStrategy);

		// apply promotional decorators (P1 adds 1%, P2 adds 2%, P3 adds 3%)
		InterestStrategy promoSavings = new P1Decorator(new P3Decorator(savingsStrategy)); // P1 for Savings
		InterestStrategy promoCheckings = new P2Decorator(checkingsStrategy); // P2 for Checkings

		// Create 2 accounts with decorated strategies
		accountService.createAccount("1263862", "Frank Brown", promoSavings);
		accountService.createAccount("4253892", "John Doe", promoCheckings);

		customerService.getAllCustomers().forEach(System.out::println);

		// Add logger and SMS sender observers to both accounts
		accountService.addObserver(logger);
		accountService.addObserver(smsSender);

		/*COMMAND PATTERN*/

		//execute deposit command
		Command depositCommand = new DepositCommand(accountService, "1263862", 240);
		commandManager.setCommand(depositCommand);
		commandManager.pressButton();

		//execute withdraw command
		Command withdrawCommand = new WithdrawCommand(accountService, "4253892", 230);
		commandManager.setCommand(withdrawCommand);
		commandManager.pressButton();

		//execute transfer command
		Command transferFunds = new TransferFundsCommand(accountService, "1263862", "4253892", 100, "payment for invoice #111");
		commandManager.setCommand(transferFunds);
		commandManager.pressButton();

		System.out.println("---");
		commandManager.showHistory();
		System.out.println("---");

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
