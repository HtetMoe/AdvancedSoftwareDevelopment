package L8_IteratorAndCompositePattern.CompositePattern;

import L8_IteratorAndCompositePattern.CompositePattern.component.Developer;
import L8_IteratorAndCompositePattern.CompositePattern.component.Manager;
import L8_IteratorAndCompositePattern.CompositePattern.composite.CompanyDirectory;

// Client
public class Main {
    public static void main(String[] args) {

        //leaf objects
        Developer developer = new Developer(101, "John");
        Manager manager = new Manager(201, "George");

        //composite object
        CompanyDirectory directory = new CompanyDirectory();

        directory.addEmployee(developer);
        directory.addEmployee(manager);

        //display all details
        directory.showDetails();
    }
}
