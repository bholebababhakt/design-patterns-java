package designpattern.structuralpattern.decorator;

// Concrete Decorator: Adds Facebook notification functionality
public class FacebookNotificationDecorator extends NotificationDecorator{
    public FacebookNotificationDecorator(Notification notification) {
        super(notification);
    }
    @Override
    public void sendNotification(String message){
        super.sendNotification(message);
        sendFacebookNotification(message);
    }

    private void sendFacebookNotification(String message){
        System.out.println("Sending Facebook Notification message: "+message);
    }
}
