package L9_StatePattern;
import L9_StatePattern.states.OffState;

public class Main {
    public static void main(String[] args) {
        // Create a context with an initial state
        Context lightContext = new Context(new OffState());

        //Request transitions between states
        lightContext.request(); // Switching to On state.
        lightContext.request(); // Switching to Off state.
    }
}
