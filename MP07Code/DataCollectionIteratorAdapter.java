import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionIteratorAdapter<T> implements DataCollection<T>, Iterable<T> {

    private DynamicArray<T> list;

    public DataCollectionIteratorAdapter() {
       list = new DynamicArray<>();
    }

    @Override
    public boolean put(T t) {
        return list.put(t);
    }

    @Override
    public T elemAt(int index) {
        return list.elemAt(index);
    }

    @Override
    public int length() {
        return list.length();
    }

    @Override
    public Iterator createIterator() {
        return list.i
    }


    @Override
    public Iterator<T> iterator() {
        return list.createIterator();
    }
}
