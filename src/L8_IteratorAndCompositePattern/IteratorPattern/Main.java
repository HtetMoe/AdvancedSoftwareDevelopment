package L8_IteratorAndCompositePattern.IteratorPattern;

import L8_IteratorAndCompositePattern.IteratorPattern.Aggregate.NameRepository;
import L8_IteratorAndCompositePattern.IteratorPattern.Iterator.Iterator;


public class Main {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        Iterator iterator = repository.createIterator();
        while (iterator.hasNext()) {
            System.out.println(STR."Name: \{iterator.next()}");
        }
    }
}
