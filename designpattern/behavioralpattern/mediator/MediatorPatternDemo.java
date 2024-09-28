package designpattern.behavioralpattern.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new BasicUser(chatRoom,"Naveen");
        User user2 = new BasicUser(chatRoom,"Aman");
        User user3 = new PremiumUser(chatRoom,"noob");
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello, everyone!");
        user2.send("Hi, Naveen!");

    }
}
