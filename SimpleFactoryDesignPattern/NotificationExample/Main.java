public class Main{
    public static void main(String args[]){
        String message = "Thank you for registering";
        NotificationFactory factory = new NotificationFactory();
        INotification sms = factory.createNotification(NotificationType.SMS);
        sms.notify(message);
    }
}