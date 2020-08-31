package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(98);
        Player player2 = new Player(90);
        Player player3 = new Player(95);
        Player player4 = new Player(94);
        Player player5 = new Player(95);
        Player player6 = new Player(99);
        Player.info();

        for (int i = player1.getStamina(); i > 0; i--)
            player1.run();

        Player.info();
    }
}
