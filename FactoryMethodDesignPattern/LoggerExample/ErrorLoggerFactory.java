public class ErrorLoggerFactory implements ILoggerFactory{
    @Override
    public ILogger createLogger(){
        return new ErrorLogger();
    }
}