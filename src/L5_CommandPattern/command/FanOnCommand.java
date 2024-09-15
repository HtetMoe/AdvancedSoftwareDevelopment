package L5_CommandPattern.command;

import L5_CommandPattern.receiver.Fan;

public class FanOnCommand implements Command{ //2. implement command
    //wrap/invoke a receiver object
    private Fan fan; // composition of the receiver

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    //encapsulate in one command object
    //every button is doing exactly one thing.
    @Override
    public void execute() { // single responsibility
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
