package Design_Pattern.Iterator;

import java.util.Iterator;

public interface EvenOddIteratorIF<T> {
    public Iterator erzeugeIterator(Element[] array,boolean even);
}
