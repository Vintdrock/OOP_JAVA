package gbCollections;

public interface GbList<T> extends Iterable<T> {
    void add(T value);
    void add(int index, T value);
    T get(int index);
    void remove(T value);
    void remove(int index);
    int size();
}
