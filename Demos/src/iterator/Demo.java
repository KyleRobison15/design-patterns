package iterator;

public class Demo {
    public static void show(){
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator<?> iterator = history.createIterator();

        while(iterator.hasNext()){
           var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
