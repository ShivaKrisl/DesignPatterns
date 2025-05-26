package ObserverDesignPattern.OrderStatusExample;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusTracker {
    private String orderId;
    private String orderStatus;

    // List to hold observers
    private List<IObserver> observers = new ArrayList<>();

    public OrderStatusTracker(String orderId) {
        this.orderId = orderId;
        this.orderStatus = "Order Placed";
    }

    public String getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return orderStatus;
    }

    public void setStatus(String status) {
        this.orderStatus = status;
        notifyObservers();
    }

    // Add an observer to the list
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    // Remove an observer from the list
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (IObserver observer : observers) {
            observer.updateOrderStatus(this);// this refers to the current instance of OrderStatusTracker
        }
    }
}
