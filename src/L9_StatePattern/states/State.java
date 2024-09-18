package L9_StatePattern.states;

import L9_StatePattern.Context;

//State interface
public interface State {
    void handle(Context context);
}
