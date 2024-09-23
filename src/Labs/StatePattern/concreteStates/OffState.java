package Labs.StatePattern.concreteStates;

import Labs.StatePattern.context.CeilingFan;
import Labs.StatePattern.states.State;

public class OffState implements State {

    @Override
    public void pullGreen(CeilingFan fan) {
        fan.setState(new LowSpeedState());
        System.out.println("low speed");
    }

    @Override
    public void pullRed(CeilingFan fan) {
        fan.setState(new HighSpeedState());
        System.out.println("high speed");
    }
}
