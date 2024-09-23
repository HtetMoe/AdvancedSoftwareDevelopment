package Labs.StatePattern.concreteStates;

import Labs.StatePattern.context.CeilingFan;
import Labs.StatePattern.states.State;

public class HighSpeedState implements State {
    @Override
    public void pullGreen(CeilingFan fan) {
        fan.setState(new OffState());
        System.out.println("turning off");
    }

    @Override
    public void pullRed(CeilingFan fan) {
        fan.setState(new MediumSpeedState());
        System.out.println("medium speed");
    }
}
