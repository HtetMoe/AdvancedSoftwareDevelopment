package Labs.composite;

import java.util.function.Consumer;

public class Employee extends Hire {

	@Override
	public Double getBudget() {
		return getSalary();
	}

	@Override
	public void process(Consumer<Hire> action) {
		action.accept(this);
	}

}
