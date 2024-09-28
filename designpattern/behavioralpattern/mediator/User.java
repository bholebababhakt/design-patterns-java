package designpattern.behavioralpattern.mediator;

// Colleague Class
//The User class represents a user in the chat room.
//Instead of sending messages directly to other users, a user sends messages through the chat room (mediator).
public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    abstract void send(String message);

    abstract void receive(String message);
}
