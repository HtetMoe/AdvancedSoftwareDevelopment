package Labs.compositePattern.functionalInterface;

import Labs.compositePattern.components.Hire;

import java.util.function.Consumer;

public class TotalBudgetConsumer implements Consumer<Hire> {
    private double totalBudget = 0; // local variable

    @Override
    public void accept(Hire hire) {
        totalBudget += hire.getBudget();
        System.out.println(STR."\{hire.getName()} budget: \{hire.getBudget()}");
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}
