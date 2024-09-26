package designpattern.structuralpattern.decorator;

//NotificationService
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Notification allNotification = new FacebookNotificationDecorator(new WhatsAppNotificationDecorator(new EmailNotificationDecorator(new SMSNotification())));
        allNotification.sendNotification("Emergency");
        Notification whatsAppNotification = new WhatsAppNotificationDecorator(new SMSNotification());
        whatsAppNotification.sendNotification("hi I am on whatsapp");
    }
}
