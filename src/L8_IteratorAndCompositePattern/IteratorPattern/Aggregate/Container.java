package L8_IteratorAndCompositePattern.IteratorPattern.Aggregate;

import L8_IteratorAndCompositePattern.IteratorPattern.Iterator.Iterator;

// Aggregate Interface
public interface Container {
    Iterator createIterator();
}
