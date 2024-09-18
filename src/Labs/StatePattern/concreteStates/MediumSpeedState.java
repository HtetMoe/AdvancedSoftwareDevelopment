package Labs.StatePattern.concreteStates;

import Labs.StatePattern.CeilingFan;

public class MediumSpeedState implements State {
    @Override
    public void pullGreen(CeilingFan fan) {
        fan.setState(new HighSpeedState());
        System.out.println("high speed");
    }

    @Override
    public void pullRed(CeilingFan fan) {
        fan.setState(new LowSpeedState());
        System.out.println("low speed");
    }
}
