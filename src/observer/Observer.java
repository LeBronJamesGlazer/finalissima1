// Interface for the Observer design pattern.
// Defines a contract for objects that should be notified of changes in a Subject.
// Classes implementing this interface (e.g., Customer) will receive updates through the update() method.
package observer;

// Observer
public interface Observer {
    void update(String status);
}
