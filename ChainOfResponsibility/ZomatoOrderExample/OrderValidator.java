package ChainOfResponsibility.ZomatoOrderExample;

public class OrderValidator extends OrderHandler {

    @Override
    public void processOrder(Order order) {
        if (order.isValid()) {
            System.out.println("Order is valid.");
            callNextHanlder(order);
        } else {
            System.out.println("Order is invalid. Cannot process further.");
        }
    }

}
