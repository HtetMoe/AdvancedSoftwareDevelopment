package Labs.composite;

public class Application {
	
	public static void main(String[] args) {
		Hire ceo = new Manager();
		TotalBudgetConsumer budgetConsumer = new TotalBudgetConsumer();
		ceo.process(budgetConsumer);
		System.out.println(budgetConsumer.getTotalBudget());
	}

}
