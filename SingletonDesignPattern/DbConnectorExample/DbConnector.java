package SingletonDesignPattern.DbConnectorExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConnector {

    private static DbConnector instance;

    private DbConnector() {
        System.out.println("Created a new DbConnector instance.");
    }

    private static Lock mutext = new ReentrantLock();

    public static DbConnector getInstance() {
        if (instance == null) {
            mutext.lock();
            try {
                if (instance == null) {
                    instance = new DbConnector();
                }
            } finally {
                mutext.unlock();
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }
}
