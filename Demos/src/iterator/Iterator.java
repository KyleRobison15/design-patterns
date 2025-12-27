package iterator;

/**
 * Iterator Interface
 * Defines the common methods for traversing and accessing elements
 *
 */
public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
