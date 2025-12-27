package iterator;

public class BrowseHistory {


    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count] = url;
        count++;
    }

    public String pop() {
        count--;
        return urls[count];
    }

    public Iterator createIterator(){
        return new ArrayIterator(this);
    }

    /*
    * Concrete implementation of the Iterator interface
    * This implementation is for iterating over Fixed Arrays of urls in the BrowseHistory
    *
    * We create this as an inner class because:
    *   1. The ListIterator is part of the BrowseHistory implementation
    *   2. It gives us access to the members of the BrowseHistory class even though they are private
    *
    * A key benefit of using this pattern is that if we wanted to change the type of collection for the URLs in this browse history class
    * the only breaking changes will be here in the BrowseHistory class. The main method will not be broken since it has been programmed to the Iterator interface.
    *
    * For example, changing the urls collection to an ArrayList<String> instead of a String[] will not cause breaking changes outside of this class!
    * If we did not use the Iterator pattern, we would have to find everywhere in our application where we are iterating over the BrowseHistory and change it.
    *
    * */
    public class ArrayIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            // If the current index is less than the total number of indexes in the list we're iterating over -> we have more items to visit
            // We have access to the urls property of the BrowseHistory class because we created this ListIterator as an inner class of the BrowseHistory class
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

}
