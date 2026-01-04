package command;

import command.framework.AbstractUndoableCommand;
import command.framework.History;

public class SetSaturationCommand extends AbstractUndoableCommand {

    private float prevSaturation;
    private float newSaturation;

    public SetSaturationCommand(VideoEditor videoEditor, History history, float newSaturation) {
        super(videoEditor, history);
        this.newSaturation = newSaturation;
    }

    @Override
    protected void doExecute() {
        prevSaturation = videoEditor.getSaturation();
        videoEditor.setSaturation(newSaturation);
    }

    @Override
    public void unexecute() {
        videoEditor.setSaturation(prevSaturation);
    }
}
