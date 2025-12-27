package memento;

public class Demo {
    public static void show(){
        System.out.println("============== MEMENTO PATTERN SOLUTION =================");
        var doc = new Document();
        var history = new DocumentHistory();
        history.push(doc.createMemento());

        doc.setFontName("Arial");
        history.push(doc.createMemento());

        doc.setFontSize(12);
        history.push(doc.createMemento());

        doc.setContent("I don't know the Memento pattern.");

        System.out.println(doc); // content: "I don't know the Memento pattern", fontName: "Arial", fontSize: 12

        doc.restore(history.pop()); // Undo new content
        doc.restore(history.pop()); // Undo fontSize
        doc.restore(history.pop()); // Undo fontName

        System.out.println(doc); // content: null, fontName: null, fontSize: 0

        doc.setContent("I DO know the memento pattern!");
        history.push(doc.createMemento());

        doc.setFontName("Comic Sans MS");
        history.push(doc.createMemento());

        doc.setFontSize(42);
        history.push(doc.createMemento());

        doc.setFontSize(10);
        doc.restore(history.pop()); // Undo font size

        System.out.println(doc); // content: "I DO know the memento pattern!", fontName: "Comic Sans MS", fontSize: 42
    }
}
