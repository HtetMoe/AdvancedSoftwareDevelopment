package L8_IteratorAndCompositePattern.IteratorPattern.Iterator;

//Concrete Iterator
public class ArrayIterator implements Iterator{
    private String[] array;
    private int index;

    public ArrayIterator(String[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return array[index++];
        }
        return null;
    }
}
