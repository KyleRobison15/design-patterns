package command;

import command.framework.History;
import command.framework.UndoCommand;

public class Demo {
    public static void show() {
        var editor = new VideoEditor();
        var history = new History();

        System.out.println("Initial Video State: " + editor);

        // Set label of video to "New Label 1"
        var setLabelCommand = new SetLabelCommand(editor, history, "New Label 1");
        setLabelCommand.execute();
        System.out.println(editor);

        // Set label of video to "New Label 1"
        setLabelCommand = new SetLabelCommand(editor, history, "New Label 2");
        setLabelCommand.execute();
        System.out.println(editor);

        // Set Contrast of video to 1.0
        var setContrastCommand = new SetContrastCommand(editor, history, 1.0f);
        setContrastCommand.execute();
        System.out.println(editor);

        // Undo set contrast
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(editor);

        // Undo set label
        undoCommand.execute();
        System.out.println(editor);

        // Undo set label again
        undoCommand.execute();
        System.out.println(editor);

        // Set final label
        setLabelCommand = new SetLabelCommand(editor, history, "Final Label!");
        setLabelCommand.execute();
        System.out.println(editor);

        // Increase contrast three times
        var increaseContrastCommand = new IncreaseContrastCommand(editor, history);
        increaseContrastCommand.execute(); // contrast = 1.0
        increaseContrastCommand.execute(); // contrast = 1.5
        increaseContrastCommand.execute(); // contrast = 2.0
        System.out.println(editor);

        // Decrease contrast once
        var decreaseContrastCommand = new DecreaseContrastCommand(editor, history);
        decreaseContrastCommand.execute(); // contrast = 1.5
        System.out.println(editor);

        // Undo decrease contrast
        undoCommand.execute(); // contrast = 2.0

        System.out.println(editor); // Final editor state -> VideoEditor{contrast=2.0, text='Final Label!'}

    }
}
