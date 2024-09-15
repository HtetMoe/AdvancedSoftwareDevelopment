package L2_ObserverPattern.OP1.observer;

public class ConcreteObserver2 implements Observer {
    private String state;

    @Override
    public void update(String state) {
        this.state = state;
        display();
    }

    public void display() {
        System.out.println(STR."ConcreteObserver2 display: \{state}");
    }
}
