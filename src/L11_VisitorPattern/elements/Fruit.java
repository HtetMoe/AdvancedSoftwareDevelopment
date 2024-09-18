package L11_VisitorPattern.elements;
import L11_VisitorPattern.visitors.Visitor;

// Concrete element: Fruit
public class Fruit implements Element {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
