package command;

import command.framework.AbstractUndoableCommand;
import command.framework.History;

public class DecreaseContrastCommand extends AbstractUndoableCommand {

    private float prevContrast;

    public DecreaseContrastCommand(VideoEditor videoEditor, History history) {
        super(videoEditor, history);
    }

    @Override
    protected void doExecute() {
        prevContrast = videoEditor.getContrast();
        videoEditor.decreaseContrast();
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(prevContrast);
    }
}
