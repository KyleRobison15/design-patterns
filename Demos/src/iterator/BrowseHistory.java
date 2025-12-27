package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    /*
    * Concrete implementation of the Iterator interface
    * This implementation is for iterating over Lists
    *
    * We create this as an inner class because:
    *   1. The ListIterator is part of the BrowseHistory implementation
    *   2. It gives us access to the members of the BrowseHistory class even though they are private
    * */
    public class ListIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            // If the current index is less than the total number of indexes in the list we're iterating over -> we have more items to visit
            // We have access to the urls property of the BrowseHistory class because we created this ListIterator as an inner class of the BrowseHistory class
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}
