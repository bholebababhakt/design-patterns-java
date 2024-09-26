package designpattern.structuralpattern.decorator;

// Concrete Decorator: Adds whatsApp notification functionality

public class WhatsAppNotificationDecorator extends NotificationDecorator {
    public WhatsAppNotificationDecorator(Notification notification) {
        super(notification);
    }
    @Override
    public void sendNotification(String message){
        super.sendNotification(message);
        sendWhatsAppNotification(message);
    }

    private void sendWhatsAppNotification(String message){
        System.out.println("Sending WhatsApp Notification message: "+message);
    }
}
