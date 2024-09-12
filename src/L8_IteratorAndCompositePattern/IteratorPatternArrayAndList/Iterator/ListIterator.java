package L8_IteratorAndCompositePattern.IteratorPatternArrayAndList.Iterator;

import java.util.List;

//Concrete Iterator
public class ListIterator implements Iterator{
    private List<String> list;
    private int index;

    public ListIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return list.get(index++);
        }
        return null;
    }
}
