package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Aggregate
 * Contains the collection that will be iterated over
 * This is the only place where the underlying representation of the collection is exposed.
 * As a result, if we decide to change from a List to something else, this is the only place we need to update our code
 * Any changes here will not break the client's ability to traverse the collection using the iterator!
 *
 * Implements the Aggregate interface to define a createIterator() method for returning the proper Concrete Iterator
 *
 */
public class BrowseHistory implements Aggregate<String> {

    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop(){
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastIndex);
        return lastUrl;
    }

    @Override
    public Iterator<String> createIterator() {
        return new BrowseHistoryIterator(urls);
    }

}
