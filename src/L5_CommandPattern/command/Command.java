package L5_CommandPattern.command;

public interface Command {
    void execute();  //1. Polymorphic method
    void undo(); // optional => for reversing the action
}
