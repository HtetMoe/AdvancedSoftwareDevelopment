package Labs.StatePattern.context;

import Labs.StatePattern.concreteStates.OffState;
import Labs.StatePattern.states.State;

//Context class
public class CeilingFan {
    State currentState;

    public CeilingFan() {
        this.currentState = new OffState(); // initial state is Off
    }

    //set state dynamically
    public void setState(State state) {
        this.currentState = state;
    }

    //behaviours
    public void pullGreen(){
        currentState.pullGreen(this);
    }

    public void pullRed(){
        currentState.pullRed(this);
    }
}
