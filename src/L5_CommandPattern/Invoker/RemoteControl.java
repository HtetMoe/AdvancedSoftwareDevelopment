package L5_CommandPattern.Invoker;

import L5_CommandPattern.command.Command;

import java.util.Stack;

public class RemoteControl {
    private Command command;
    private Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute(); // 3. Polymorphic call
        commandHistory.push(command);
    }

    public void pressUndo() {
        //command.undo();
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }

    // Log all executed commands
    public void showHistory() {
        System.out.println("Command History:");
        for (Command cmd : commandHistory) {
            System.out.println(cmd.getClass().getSimpleName());
        }
    }
}
