package L8_IteratorAndCompositePattern.CompositePattern.component;

// Leaf
public class Developer implements Employee{
    private long empId;
    private String name;


    public Developer(long empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println(STR."\{empId}, \{name}");
    }

}
