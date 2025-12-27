package iterator;

/**
* Aggregate Interface
* Defines a method for creating an Iterator object
*
*/
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
