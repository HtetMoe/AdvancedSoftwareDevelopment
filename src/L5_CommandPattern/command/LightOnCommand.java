package L5_CommandPattern.command;

import L5_CommandPattern.receiver.Light;

public class LightOnCommand implements Command{
    private Light light;

    //constructor
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
