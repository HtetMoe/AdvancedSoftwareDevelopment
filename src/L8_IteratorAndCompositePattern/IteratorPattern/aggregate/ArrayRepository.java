package L8_IteratorAndCompositePattern.IteratorPattern.aggregate;

import L8_IteratorAndCompositePattern.IteratorPattern.Iterator.ArrayIterator;
import L8_IteratorAndCompositePattern.IteratorPattern.Iterator.Iterator;

public class ArrayRepository implements Container{
    private  String[] array = {"A", "B", "C"};
    @Override
    public Iterator createIterator() {
        return new ArrayIterator(array);
    }
}
