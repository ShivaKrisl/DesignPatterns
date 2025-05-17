public class NotificationFactory{

    public INotification createNotification(NotificationType type){
        switch(type){
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            default:
                return null;
        }
    }

}