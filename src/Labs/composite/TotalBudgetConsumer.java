package Labs.composite;

import Labs.composite.component.Hire;

import java.util.function.Consumer;

public class TotalBudgetConsumer implements Consumer<Hire>{
	private Double totalBudget = 0.0;
	
	@Override
	public void accept(Hire t) {
		totalBudget += t.getBudget();
	}

	public Double getTotalBudget() {
		return totalBudget;
	}

}
