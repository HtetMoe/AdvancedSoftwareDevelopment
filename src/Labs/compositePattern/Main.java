package Labs.compositePattern;

import Labs.compositePattern.components.Employee;
import Labs.compositePattern.components.Hire;
import Labs.compositePattern.components.Manager;
import Labs.compositePattern.functionalInterface.TotalBudgetConsumer;

public class Main {
    public static void main(String[] args) {

        //ceo
        Hire ceo = new Employee();
        ceo.setName("CEO");
        ceo.setSalary(10000.0);

        //manager
        Manager manager = new Manager();
        manager.setName("Manager");
        manager.setSalary(9000.0);
        manager.setBonus(1000.0);

        //sale executive
        Employee sale = new Employee();
        sale.setName("Sale");
        sale.setSalary(4000.0);

        manager.addTeamMember(sale);
        manager.addTeamMember(ceo);

        System.out.println(STR."manager budget: \{manager.getBudget()}");
        System.out.println();

        // use consumer
        TotalBudgetConsumer budgetConsumer = new TotalBudgetConsumer();
        manager.process(budgetConsumer);
        System.out.println(STR."Total Budget : \{budgetConsumer.getTotalBudget()}");
    }
}
