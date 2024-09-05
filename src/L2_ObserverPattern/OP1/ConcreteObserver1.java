package L2_ObserverPattern.OP1;

//define how they handle updates.
public class ConcreteObserver1 implements Observer{
    private String state;

    @Override
    public void update(String state) {
        this.state = state;
        display();
    }

    public void display() {
        System.out.println("ConcreteObserver1 display: " + state);
    }
}
