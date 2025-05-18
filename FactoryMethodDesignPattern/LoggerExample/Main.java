public class Main {
    public static void main(String args[]) {
        String message = "This is a sample message";
        // lets create a Info logger
        ILoggerFactory infoFactory = new InfoLoggerFactory();
        ILogger infoLogger = infoFactory.createLogger();
        infoLogger.log(message);
    }
}