package Labs.composite.leaf;

import Labs.composite.component.Hire;

import java.util.function.Consumer;

//leaf
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
