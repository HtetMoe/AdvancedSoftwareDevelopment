package L2_ObserverPattern.OP1.subject;

import L2_ObserverPattern.OP1.observer.Observer;

import java.util.ArrayList;
import java.util.List;

// maintains the state and notifies all registered observers of changes.
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    //setting and getting its state
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public String getState() {
        return state;
    }
}
