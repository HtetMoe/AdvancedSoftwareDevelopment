package L8_IteratorAndCompositePattern.IteratorPatternArrayAndList;

import java.util.ArrayList;
import java.util.Arrays;

import L8_IteratorAndCompositePattern.IteratorPatternArrayAndList.Iterator.ArrayIterator;
import L8_IteratorAndCompositePattern.IteratorPatternArrayAndList.Iterator.Iterator;
import L8_IteratorAndCompositePattern.IteratorPatternArrayAndList.Iterator.ListIterator;

public class Main {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList("D", "E", "F"));

        //Aggregate
        Iterator arrayIterator = new ArrayIterator(array);
        Iterator listIterator  = new ListIterator(list);

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
