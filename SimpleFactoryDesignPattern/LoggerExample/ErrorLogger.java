public class ErrorLogger implements ILogger{
    public void log(String message){
        System.out.println("Error:"+message);
    }
}