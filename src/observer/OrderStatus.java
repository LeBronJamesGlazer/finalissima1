package observer;

import java.util.ArrayList;
import java.util.List;

// Class which is looking at status
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
