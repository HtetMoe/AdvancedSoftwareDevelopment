package Labs.Account.command.invoker;

import L5_CommandPattern.command.Command;

import java.util.Stack;

public class CommandManager {
    private Command command;
    private Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    //execute
    public void pressButton() {
        command.execute(); // 3. Polymorphic call
        commandHistory.push(command);
    }

    public void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }

    // Log all executed commands
    public void showHistory() {
        System.out.println(STR."Command History: size => \{commandHistory.size()}");
        for (Command cmd : commandHistory) {
            System.out.println(cmd.getClass().getSimpleName());
        }
    }

}
