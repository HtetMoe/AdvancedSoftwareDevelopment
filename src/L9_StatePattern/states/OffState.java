package L9_StatePattern.states;

import L9_StatePattern.Context;

public class OffState implements State{
    @Override
    public void handle(Context context) {
        System.out.println("Switching to On state.");
        context.setState(new OnState());  // Switch to another state using context reference
    }
}
