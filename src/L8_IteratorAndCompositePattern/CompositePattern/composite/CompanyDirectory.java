package L8_IteratorAndCompositePattern.CompositePattern.composite;

import L8_IteratorAndCompositePattern.CompositePattern.component.Employee;

import java.util.ArrayList;
import java.util.List;

// Composite - can contain manager and employee
public class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    @Override
    public void showDetails() {
        for (Employee emp : employeeList) {
            emp.showDetails(); // Recursive call for each item
        }
    }
}
