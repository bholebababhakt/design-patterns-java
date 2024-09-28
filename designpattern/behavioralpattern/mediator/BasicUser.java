package designpattern.behavioralpattern.mediator;

// Concrete Colleague
public class BasicUser extends User {

    public BasicUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    void send(String message) {
        System.out.println(this.name + " sends: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    void receive(String message) {
        System.out.println(this.name + " received: " + message);
    }
}
