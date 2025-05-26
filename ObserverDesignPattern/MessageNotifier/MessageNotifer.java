package ObserverDesignPattern.MessageNotifier;

import java.util.ArrayList;

public class MessageNotifer {

    private String message;
    private ArrayList<IObserver> observers = new ArrayList<>();

    // Constructor
    public MessageNotifer(String message) {
        this.message = message;
    }

    // add observers -- Subscribe
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    // remove observers -- Unsubscribe
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    // Notify all observers
    private void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }
}
