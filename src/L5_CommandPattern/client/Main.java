package L5_CommandPattern.client;

import L5_CommandPattern.Invoker.RemoteControl;
import L5_CommandPattern.command.Command;
import L5_CommandPattern.command.FanOnCommand;
import L5_CommandPattern.command.LightOffCommand;
import L5_CommandPattern.command.LightOnCommand;
import L5_CommandPattern.receiver.Fan;
import L5_CommandPattern.receiver.Light;

/*
    •   The Command Pattern encapsulates the requests as command objects
        (LightOnCommand, LightOffCommand, FanOnCommand).
	•	The Receiver objects (Light, Fan) execute the actual actions.
	•	The Invoker (RemoteControl) triggers the commands.
	•	The Client can dynamically assign different commands to the invoker and
	    even use the undo functionality.
 */

public class Main {
    public static void main(String[] args) {

        //receiver objects (Light and Fan)
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        //command objects
        Command lightOn  = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn    = new FanOnCommand(ceilingFan);

        //invoker
        RemoteControl remote = new RemoteControl();

        //turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        //turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();

        //turn the fun on
        remote.setCommand(fanOn);
        remote.pressButton();

        remote.showHistory();

        //undo last operation
        remote.pressUndo();
    }
}
