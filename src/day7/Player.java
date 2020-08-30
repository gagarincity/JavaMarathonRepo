package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public static void run(Player player) {
        player.stamina--;
        if (player.stamina == MIN_STAMINA)
            countPlayers--;
    }

    public static void info() {
        switch (countPlayers) {
            case 1:
                System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных мест");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных места");
                break;
            case 5:
                System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободное место");
                break;
            default:
                System.out.println("Мест в команде больше нет");
                break;
        }
    }
}
