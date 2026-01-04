package command.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commandMementos = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commandMementos.push(command);
    }

    public UndoableCommand pop() {
        return commandMementos.pop();
    }

    public int size() {
        return commandMementos.size();
    }
}
