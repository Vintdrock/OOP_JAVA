package gbCollections;

public interface GbList<T> extends Iterable<T> {
    void add(T value);
    void add(int index, T value);
    T get(int index);
    void removeByValue(T value);
    void removeByIndex(int index);
    int size();
}
