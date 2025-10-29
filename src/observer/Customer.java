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
