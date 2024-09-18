package L11_VisitorPattern.elements;
import L11_VisitorPattern.visitors.Visitor;

// Concrete element: Book
public class Book implements Element {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

