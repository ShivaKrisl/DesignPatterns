package SingletonDesignPattern.PaymentGatewayExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PaymentGateway {
    private static PaymentGateway instance;

    private static int instanceCount = 0;

    private PaymentGateway() {
        // Private constructor to prevent instantiation
        instanceCount++;
        System.out.println("PaymentGateway instance created; No.of Objects = " + instanceCount);
    }

    private static Lock lock = new ReentrantLock();

    public static PaymentGateway getInstance() {
        if (instance == null) {
            lock.lock();
            try {
                if (instance == null) {
                    instance = new PaymentGateway();
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    public void processPayment(String paymentDetails) {
        // Simulate payment processing
        System.out.println("Processing payment: " + paymentDetails);
    }
}
