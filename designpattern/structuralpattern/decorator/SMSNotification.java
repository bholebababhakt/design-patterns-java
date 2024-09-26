package designpattern.structuralpattern.decorator;

// Concrete Component: Basic SMS notification
public class SMSNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending sms message: "+message);
    }
}
