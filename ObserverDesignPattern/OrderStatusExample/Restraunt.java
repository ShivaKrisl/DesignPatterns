package ObserverDesignPattern.OrderStatusExample;

public class Restraunt implements IObserver {

    private String name;

    public Restraunt(String name) {
        this.name = name;
    }

    @Override
    public void updateOrderStatus(OrderStatusTracker order) {
        System.out.println("Restaurant " + name + " has been notified of order status change: " + order.getStatus()
                + " for Order Id: " + order.getOrderId());
    }

    public String getName() {
        return name;
    }

}
