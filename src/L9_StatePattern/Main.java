package L9_StatePattern;

import L9_StatePattern.states.OnState;
import L9_StatePattern.states.OffState;

public class Main {
    public static void main(String[] args) {
        // Create a context with an initial state
        Context context = new Context(new OffState());

        //Request transitions between states
        context.request(); // on
        context.request(); // off
    }
}
