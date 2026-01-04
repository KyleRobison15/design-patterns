package command.framework;

import command.VideoEditor;

/**
 * The purpose of this class is:
 *  1. Ensures that all undoable commands have a VideoEditor and a History -> Great use case for an Abstract class because:
 *      We need a mix of abstraction AND implementation detail
 *  2. Ensures that when any undoable command is executed, it is pushed to the history
 *
 *  Without the template method, concrete implementations of the undoable command may forget to push to the history!
 */
public abstract class AbstractUndoableCommand implements UndoableCommand {

    protected VideoEditor videoEditor;
    protected History history;

    public AbstractUndoableCommand(VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        // Variant piece of the execute method for any undoable command ->
        //  Extending classes will customize the doExecute() (primitive operation) based on their needs
        doExecute();

        // Invariant piece of the execute method for any undoable command
        // This ensures the history is always updated when any concrete command class is executed
        history.push(this);
    }

    protected abstract void doExecute();

}
