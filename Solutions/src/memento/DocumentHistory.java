package memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class DocumentHistory {
    private Deque<DocumentMemento> mementos = new ArrayDeque<>();

    public void push(DocumentMemento documentMemento) {
        mementos.push(documentMemento);
    }

    public DocumentMemento pop() {return mementos.pop();}

}
