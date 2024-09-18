package Labs.StatePattern.concreteStates;
import Labs.StatePattern.CeilingFan;

public class LowSpeedState implements State {
    @Override
    public void pullGreen(CeilingFan fan) {
        fan.setState(new MediumSpeedState());
        System.out.println("medium speed");
    }

    @Override
    public void pullRed(CeilingFan fan) {
        fan.setState(new OffState());
        System.out.println("turning off");
    }
}
