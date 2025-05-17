public class EmailNotification implements INotification{

    public void notify(String message){
        System.out.println("Email:"+message);
    }

}