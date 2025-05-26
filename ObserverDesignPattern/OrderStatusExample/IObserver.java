package ObserverDesignPattern.OrderStatusExample;

public interface IObserver {

    void updateOrderStatus(OrderStatusTracker order);
}
