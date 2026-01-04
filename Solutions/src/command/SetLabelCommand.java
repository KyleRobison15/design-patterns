package command;

import command.framework.AbstractUndoableCommand;
import command.framework.History;

public class SetLabelCommand extends AbstractUndoableCommand {

    private String prevLabel;
    private String newLabel;

    public SetLabelCommand(VideoEditor videoEditor, History history,  String newLabel) {
        super(videoEditor, history);
        this.newLabel = newLabel;
    }

    @Override
    protected void doExecute() {
        prevLabel = videoEditor.getText();
        videoEditor.setText(newLabel);
    }

    @Override
    public void unexecute() {
        videoEditor.setText(prevLabel);
    }
}
