package iterator;

/**
 * In the Iterator Pattern, this main class acts as the client: The application that needs to iterate over some aggregate
 *
 */
public class Demo {
    public static void show(){

        BrowseHistory history = new BrowseHistory();

        history.push("https://www.google.com");
        history.push("https://www.github.com");
        history.push("https://www.linkedin.com");

        Iterator<?> iterator = history.createIterator();

        while(iterator.hasNext()){
           var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
