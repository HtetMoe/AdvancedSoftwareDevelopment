package L2_ObserverPattern.Weather.subject;

import L2_ObserverPattern.Weather.observers.Observer;

// =>  Maintains a list of observers and notifies them of state changes.
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
