package ChainOfResponsibility.ZomatoOrderExample;

public class DeliveryHandler extends OrderHandler {

    @Override
    public void processOrder(Order order) {
        if (order.isValid()) {
            System.out.println("Assigning delivery partner");
            callNextHanlder(order);
        } else {
            System.out.println("error");
        }
    }
}
