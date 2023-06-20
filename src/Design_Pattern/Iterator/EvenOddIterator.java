package Design_Pattern.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenOddIterator<T> implements EvenOddIteratorIF<T> {

    @Override
    public Iterator erzeugeIterator(Element[] array, boolean even) {
        return null;
    }

    public class KonkreterIterator implements Iterator{
        private T [] array;
        private int pos = 0;
        public KonkreterIterator(T[] array, boolean even) {
            this.array = array;
            this.pos = even ? 0 : 1;
        }

        @Override
        public boolean hasNext() {
            return pos < array.length;
        }

        @Override
        public T next() {
            if(!hasNext()) {
                throw  new NoSuchElementException();
            }
            T tmp = array[pos];
            pos +=2;
            return tmp;
        }
    }

    public static void main(String[] args) {
        Integer [] feld = {1,2,3,4,5,6,7,8,9,10};
        EvenOddIterator<Integer>   iterator = new EvenOddIterator<>();


    }
}