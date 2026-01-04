package command;

import command.editor.BoldCommand;
import command.editor.History;
import command.editor.HtmlDocument;
import command.editor.UndoCommand;
import command.framework.Button;

public class Demo {
    public static void show(){
        System.out.println("==================== BASIC COMMAND PATTERN DEMO ===========================");
        var command = new AddCustomerCommand(new CustomerService());
        var button = new Button(command);
        button.click();

        System.out.println("==================== COMPOSITE COMMAND PATTERN DEMO ===========================");
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

        System.out.println("==================== UNDO COMMAND PATTERN DEMO ===========================");
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Design Patterns are Cool!");
        System.out.println("Before making bold: " + document.getContent());

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println("After making bold: " + document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();

        System.out.println("After undoing bold command: " + document.getContent());


    }
}
