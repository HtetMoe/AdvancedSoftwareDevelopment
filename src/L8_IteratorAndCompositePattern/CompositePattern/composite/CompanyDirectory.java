package L8_IteratorAndCompositePattern.CompositePattern.composite;

import L8_IteratorAndCompositePattern.CompositePattern.component.Employee;

import java.util.ArrayList;
import java.util.List;

// Composite
public class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }
}
