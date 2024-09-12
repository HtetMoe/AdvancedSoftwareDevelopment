package L2_ObserverPattern.OP1.subject;

import L2_ObserverPattern.OP1.observer.Observer;

// defines methods to add, remove, and notify observers.
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
