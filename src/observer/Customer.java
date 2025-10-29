// Concrete Observer class in the Observer design pattern.
// Represents a customer who receives notifications about order status changes.
// Implements the Observer interface and reacts to updates by printing status messages.
package observer;

// Concrete Observer — client
public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("👤 " + name + ", your order is now: " + status);
    }
}
