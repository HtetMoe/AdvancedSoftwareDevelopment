package L11_VisitorPattern.elements;

import L11_VisitorPattern.visitors.Visitor;

// Interface for elements that can accept visitors
public interface Element {
    void accept(Visitor visitor);
}
