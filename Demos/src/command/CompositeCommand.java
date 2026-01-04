package command;

import command.framework.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * This structure allows us to execute a sequence of multiple commands.
 * It simply aggregates commands in a list and then executes them one by one.
 */
public class CompositeCommand implements Command {
    List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for(var command : commands) {
            command.execute();
        }
    }
}
