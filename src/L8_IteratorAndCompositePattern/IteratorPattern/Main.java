package L8_IteratorAndCompositePattern.IteratorPattern;

import L8_IteratorAndCompositePattern.IteratorPattern.Iterator.Iterator;
import L8_IteratorAndCompositePattern.IteratorPattern.aggregate.ArrayRepository;
import L8_IteratorAndCompositePattern.IteratorPattern.aggregate.ListRepository;

public class Main {
    public static void main(String[] args) {

        //Aggregate
        ArrayRepository arrayRepository = new ArrayRepository();
        ListRepository listRepository = new ListRepository();

        Iterator arrayIterator = arrayRepository.createIterator();
        Iterator listIterator  = listRepository.createIterator();

        //Polymorphism applied here
        printItems(arrayIterator);
        printItems(listIterator);

    }
    public static void printItems(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
