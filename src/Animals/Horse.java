package Animals;

public class Horse extends Animal {
    public static String type = "horse";
    public static double buycost = 2500;
    public static double kgs_week = 5;
    public static int weeks_adult = 20;
    public static int eat_per_week = 5;
    public static String[] eat = {"wheat", "beetroot", "apple"};
    public static double reproductionChance = 0.1;
    public static int earnings_per_week = 250;
    public static int money_per_kg = 35;

    public Horse() {
        super("horse", 2500, 5, 20, 5, new String[]{"wheat", "beetroot", "apple"}, 0.1, 250, 35);
    }
}
