public class LoggerFactory{
    public ILogger createLogger(LoggerLevel level){
        switch(level){
            case INFO:
                return new InfoLogger();
            case ERROR:
                return new ErrorLogger();
            default:
                return null;
        }
    }
}