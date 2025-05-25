package SingletonDesignPattern.DbConnectorExample;

public class Main {
    public static void main(String[] args) {
        DbConnector dbConnector1 = DbConnector.getInstance();
        dbConnector1.connect();

        DbConnector dbConnector2 = DbConnector.getInstance();
        dbConnector2.connect();

        // Verify that both instances are the same
        if (dbConnector1 == dbConnector2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}
