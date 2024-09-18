package L11_VisitorPattern.visitors;

import L11_VisitorPattern.elements.Book;
import L11_VisitorPattern.elements.Fruit;

// Concrete visitor that defines operations for each element
public class PrintVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println(STR."Visiting book: \{book.getTitle()}");
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println(STR."Visiting fruit: \{fruit.getName()}");
    }
}
