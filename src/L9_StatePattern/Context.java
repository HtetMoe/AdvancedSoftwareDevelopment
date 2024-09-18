package L9_StatePattern;

import L9_StatePattern.states.State;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state; // update state
    }

    //behavior
    public void request() {
        state.handle(this); // delegate request to state object
    }
}
