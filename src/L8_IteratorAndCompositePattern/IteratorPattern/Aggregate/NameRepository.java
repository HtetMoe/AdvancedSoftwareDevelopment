package L8_IteratorAndCompositePattern.IteratorPattern.Aggregate;

import L8_IteratorAndCompositePattern.IteratorPattern.Iterator.Iterator;
import L8_IteratorAndCompositePattern.IteratorPattern.Iterator.NameIterator;

public class NameRepository implements Container{
    private String[] names = {"John", "Paul", "George", "Ringo"};

    @Override
    public Iterator createIterator() {
        return new NameIterator(names);
    }
}
