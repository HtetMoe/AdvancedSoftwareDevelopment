package L2_ObserverPattern.Weather.observers;

// => An interface for objects that should be notified when the subject changes.
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
