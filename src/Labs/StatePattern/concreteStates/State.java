package Labs.StatePattern.concreteStates;

import Labs.StatePattern.CeilingFan;

public interface State {
    void pullGreen(CeilingFan fan);
    void pullRed(CeilingFan fan);
}
