// Interface for the Observer design pattern.
// Represents the Subject (or Observable) that maintains a list of observers.
// Provides methods to attach, detach, and notify all registered observers about state changes.
// Implemented by classes like OrderStatus to broadcast updates to observers such as Customer.
package observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
