package designpattern.structuralpattern.decorator;

// Decorator: The base decorator class, implementing Notification
//decorator will hold a reference to a Notification object and delegate calls to it
//here we "wrap" additional behavior around the base notification.
public abstract class NotificationDecorator implements Notification {
    private Notification wrappedNotification;
    public NotificationDecorator(Notification wrappedNotification){
        this.wrappedNotification = wrappedNotification;
    }

    @Override
    public void sendNotification(String message) {
        wrappedNotification.sendNotification(message);// Delegates to the wrapped notification
    }
}
