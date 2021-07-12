package Animals;

public class Pig extends Animal {
    public static String type = "pig";
    public static double buycost = 500;
    public static double kgs_week = 2;
    public static int weeks_adult = 10;
    public static int eat_per_week = 2;
    public static String[] eat = {"wheat", "beetroot", "apple"};
    public static double reproductionChance = 0.15;
    public static int earnings_per_week = 0;
    public static int money_per_kg = 35;

    public Pig() {
        super("pig", 500, 2, 10, 2, new String[]{"wheat", "beetroot", "apple"}, 0.15, 0, 35);
    }
}
