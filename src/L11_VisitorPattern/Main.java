package L11_VisitorPattern;

import L11_VisitorPattern.elements.Book;
import L11_VisitorPattern.elements.Element;
import L11_VisitorPattern.elements.Fruit;
import L11_VisitorPattern.visitors.PrintVisitor;
import L11_VisitorPattern.visitors.Visitor;

//client
public class Main {
    public static void main(String[] args) {
        // Create elements
        Element book = new Book("Design Patterns");
        Element fruit = new Fruit("Apple");

        // Create visitor
        Visitor printVisitor = new PrintVisitor();

        // Apply visitor to each element
        book.accept(printVisitor);
        fruit.accept(printVisitor);
    }
}
