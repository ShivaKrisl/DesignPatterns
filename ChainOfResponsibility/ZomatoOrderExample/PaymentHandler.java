package ChainOfResponsibility.ZomatoOrderExample;

public class PaymentHandler extends OrderHandler {

    @Override
    public void processOrder(Order order) {
        if (order.isValid()) {
            System.out.println("payment processed for " + order.toString());
            // After processing payment, we can call the next handler in the chain
            callNextHanlder(order);
        }
    }
}
