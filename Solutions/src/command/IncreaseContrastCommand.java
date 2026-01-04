package command;

import command.framework.AbstractUndoableCommand;
import command.framework.History;

public class IncreaseContrastCommand extends AbstractUndoableCommand {

    private float prevContrast;

    public IncreaseContrastCommand(VideoEditor videoEditor, History history) {
        super(videoEditor, history);
    }

    @Override
    protected void doExecute() {
        prevContrast = videoEditor.getContrast();
        videoEditor.increaseContrast();
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(prevContrast);
    }
}
