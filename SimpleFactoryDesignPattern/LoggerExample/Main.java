public class Main{
    public static void main(String args[]){

        String message = "This is a sample message";
        LoggerFactory factory = new LoggerFactory();
        ILogger infoLogger = factory.createLogger(LoggerLevel.INFO);
        infoLogger.log(message);

    }
}