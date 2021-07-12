package Animals;

public class Cow extends Animal {
    public static String type = "cow";
    public static double buycost = 1000;
    public static double kgs_week = 3;
    public static int weeks_adult = 15;
    public static int eat_per_week = 3;
    public static String[] eat = {"wheat", "beetroot", "apple"};
    public static double reproductionChance = 0.1;
    public static int earnings_per_week = 80;
    public static int money_per_kg = 40;

    public Cow() {
        super("cow", 1000, 3, 15, 3, new String[]{"wheat", "beetroot", "apple"}, 0.1, 80, 40);
    }
}
