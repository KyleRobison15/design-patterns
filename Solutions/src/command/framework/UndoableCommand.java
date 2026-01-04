package command.framework;

public interface UndoableCommand extends Command {
    void unexecute();
}
