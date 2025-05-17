public class InfoLogger implements ILogger{
    public void log(String message){
        System.out.println("Info:"+message);
    }
}