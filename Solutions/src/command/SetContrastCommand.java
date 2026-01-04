package command;

import command.framework.AbstractUndoableCommand;
import command.framework.History;

public class SetContrastCommand extends AbstractUndoableCommand {

    private float prevContrast;
    private float newContrast;

    public SetContrastCommand(VideoEditor videoEditor, History history, float newContrast) {
        super(videoEditor, history);
        this.newContrast = newContrast;
    }

    @Override
    protected void doExecute() {
        prevContrast = videoEditor.getContrast();
        videoEditor.setContrast(newContrast);
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(prevContrast);
    }
}
