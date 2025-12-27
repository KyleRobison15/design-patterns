package iterator;

// Aggregate
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
