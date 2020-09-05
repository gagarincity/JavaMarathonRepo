package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Ivan");
        User user2 = new User("Oleg");
        User user3 = new User("John");

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "First message");
        user2.sendMessage(user1, "Second message");
        user2.sendMessage(user1, "Third message");
        user3.sendMessage(user1, "One message");
        user3.sendMessage(user1, "Two message");
        user3.sendMessage(user1, "Three message");
        user3.sendMessage(user1, "Four message");
        user1.sendMessage(user3, "A");
        user1.sendMessage(user3, "B");
        user1.sendMessage(user3, "C");

        MessageDatabase.showDialog(user1, user3);
    }
}
