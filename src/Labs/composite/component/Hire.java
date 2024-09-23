package Labs.composite.component;

import java.util.function.Consumer;

public abstract class Hire {
	private String name;
	private String email;
	private Double salary;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public Double getSalary() {
		return salary;
	}

	public abstract Double getBudget();
	public abstract void process(Consumer<Hire> action);

}
