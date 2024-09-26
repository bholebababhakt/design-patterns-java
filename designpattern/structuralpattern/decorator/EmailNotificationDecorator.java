package designpattern.structuralpattern.decorator;

// Concrete Decorator: Adds email notification functionality
public class EmailNotificationDecorator extends NotificationDecorator {
    public EmailNotificationDecorator(Notification notification) {
        super(notification);
    }
    @Override
    public void sendNotification(String message){
        super.sendNotification(message); // Send the original notification (e.g., SMS)
        sendEmailNotification(message);  // Add push functionality
    }

    private void sendEmailNotification(String message){
        System.out.println("Sending Email message: "+message);
    }

}
