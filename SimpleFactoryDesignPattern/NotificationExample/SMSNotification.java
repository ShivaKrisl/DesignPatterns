public class SMSNotification implements INotification{

    public void notify(String message){
        System.out.println("SMS:"+message);
    }

}