package iterator;

import java.util.List;

/**
 * Concrete Iterator
 * Implements the Iterator interface
 *
 * This provides the concrete implementation logic required to iterate over the Browser History List in the BrowseHistory class
 * If we change the BrowseHistory class to use a different type of collection tomorrow, this is the only place we need to change the iteration logic
 *
 */
public class BrowseHistoryIterator implements Iterator<String> {
    private List<String> history;
    private int index;

    public BrowseHistoryIterator(List<String> history) {
        this.history = history;
    }

    @Override
    public boolean hasNext() {
        // If the current index is less than the total number of indexes in the list we're iterating over -> we have more items to visit
        // We have access to the urls property of the BrowseHistory class because we created this ListIterator as an inner class of the BrowseHistory class
        return (index < history.size());
    }

    @Override
    public String current() {
        return history.get(index);
    }

    @Override
    public void next() {
        index++;
    }
}
