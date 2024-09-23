package Labs.StatePattern.states;

import Labs.StatePattern.context.CeilingFan;

public interface State {
    void pullGreen(CeilingFan fan);
    void pullRed(CeilingFan fan);
}
