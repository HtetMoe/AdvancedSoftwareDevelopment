package Labs.compositePattern.components;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Manager extends Hire {
	List<Hire> team = new ArrayList<>();
	private double bonus = 0.0;

	public void addTeamMember(Hire hire) {
		team.add(hire);
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public Double getSalary() {
		return bonus + super.getSalary();
	}

	@Override
	public Double getBudget() {
		double totalBudget = getSalary(); // included bonus
		for (Hire person : team) {
			totalBudget += person.getBudget();
		}
		return totalBudget;
	}

	@Override
	public void process(Consumer<Hire> action) {
		action.accept(this);
		for (Hire hire : team) {
			hire.process(action);
		}
	}
}
