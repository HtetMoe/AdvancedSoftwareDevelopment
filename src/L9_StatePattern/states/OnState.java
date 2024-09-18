package L9_StatePattern.states;

import L9_StatePattern.Context;

// Concrete state
public class OnState implements State{

    @Override
    public void handle(Context context) {
        System.out.println("Switching to Off state.");
        context.setState(new OffState());   // Switch to another state using context reference
    }
}
