package L11_VisitorPattern.visitors;

import L11_VisitorPattern.elements.Book;
import L11_VisitorPattern.elements.Fruit;

// Visitor interface with methods for each concrete element
public interface Visitor {
    void visit(Book book);
    void visit(Fruit fruit);
}
