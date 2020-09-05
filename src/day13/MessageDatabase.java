package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static void showDialog(User u1, User u2) {
        for (Message user : messages) {
            if (((user.getSender() == u1) && (user.getReceiver() == u2)) || ((user.getSender() == u2) && (user.getReceiver() == u1)))
                System.out.println(user.getSender() + ": " + user.getText());
        }
    }
}
