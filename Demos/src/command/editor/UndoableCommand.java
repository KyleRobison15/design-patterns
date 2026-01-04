package command.editor;

/**
 * The UndoableCommand class extends the Command interface
 * This way, every UndoableCommand inherits the same core functionality of a command
 * Because not every command is undoable!
 */
public interface UndoableCommand extends Command {
    void unexecute();
}
