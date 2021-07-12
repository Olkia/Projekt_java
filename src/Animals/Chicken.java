package Animals;

public class Chicken extends Animal {
    public static String type = "chicken";
    public static double buycost = 100;
    public static double kgs_week = 0.5;
    public static int weeks_adult = 7;
    public static int eat_per_week = 1;
    public static String[] eat = {"wheat"};
    public static double reproductionChance = 0.2;
    public static int earnings_per_week = 20;
    public static int money_per_kg = 35;

    public Chicken() {
        super("chicken", 100, 0.5, 7, 1, new String[]{"wheat"}, 0.2, 20, 35);
    }
}
