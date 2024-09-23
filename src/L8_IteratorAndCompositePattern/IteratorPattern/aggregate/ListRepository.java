package L8_IteratorAndCompositePattern.IteratorPattern.aggregate;

import L8_IteratorAndCompositePattern.IteratorPattern.Iterator.Iterator;
import L8_IteratorAndCompositePattern.IteratorPattern.Iterator.ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRepository implements Container{
    private List<String> list = new ArrayList<>(Arrays.asList("D", "E", "F"));

    @Override
    public Iterator createIterator() {
        return new ListIterator(list);
    }
}
