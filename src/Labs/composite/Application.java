package Labs.composite;

import Labs.composite.component.Hire;
import Labs.composite.composite.Manager;

public class Application {
	
	public static void main(String[] args) {
		Hire ceo = new Manager();
		TotalBudgetConsumer budgetConsumer = new TotalBudgetConsumer();
		ceo.process(budgetConsumer);
		System.out.println(budgetConsumer.getTotalBudget());
	}

}
