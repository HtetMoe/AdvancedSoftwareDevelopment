package L8_IteratorAndCompositePattern.CompositePattern;

import L8_IteratorAndCompositePattern.CompositePattern.component.Developer;
import L8_IteratorAndCompositePattern.CompositePattern.component.Manager;
import L8_IteratorAndCompositePattern.CompositePattern.composite.CompanyDirectory;

// Client
public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer(101, "John");
        Developer dev2 = new Developer(102, "Paul");

        Manager man1 = new Manager(201, "George");

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(dev1);
        directory.addEmployee(dev2);
        directory.addEmployee(man1);

        directory.showEmployeeDetails();
    }
}
