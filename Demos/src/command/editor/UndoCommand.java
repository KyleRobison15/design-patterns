package command.editor;

/**
 * This class is an abstraction for ANY undo commands.
 * The execute command for the UndoCommand uses a reference to a History object to
 * - Get the last command (the history will only contain undoable commands)
 * - Call the unexecute() method for that command
 */
public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(history.size() > 0) {
            history.pop().unexecute(); // The unexcute method is available here because the History class only contains a list of UNDOABLE commands!
        }
    }
}
