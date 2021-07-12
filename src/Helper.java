import java.util.ArrayList;
import java.util.Scanner;

public class Helper {
    static Scanner s = new Scanner(System.in);

    public static void waitForEnter() {
        s.nextLine();
    }


    public static void clearlogs() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public static void bump() {
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
    }

    public static boolean isAnyWinner(ArrayList<Player> players) {

        for (Player pl : players) {
            if (pl.isWinner()) {
                System.out.println(pl.name + " wygrał ! ");
                return true;
            }
        }
        return false;
    }

}


