package observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject class in the Observer design pattern.
// Maintains a list of observers (customers) and notifies them whenever the order status changes.
// It provides methods to add, remove, and update observers.
// When setStatus() is called, it updates the internal state and triggers notifications.
public class OrderStatus implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    // Устанавливаем новый статус и уведомляем всех наблюдателей
    public void setStatus(String status) {
        this.status = status;
        System.out.println("\n📦 Order status changed to: " + status);
        notifyObservers();
    }
}
