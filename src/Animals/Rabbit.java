package Animals;

public class Rabbit extends Animal {
    public static String type = "rabbit";
    public static double buycost = 80;
    public static double kgs_week = 0.5;
    public static int weeks_adult = 5;
    public static int eat_per_week = 1;
    public static String[] foods = {"wheat"};
    public static double reproductionChance = 0.35;
    public static double earnings_per_week = 0;
    public static double money_per_kg = 45;

    public Rabbit() {
        super("rabbit", 80, 0.5, 5, 1, new String[]{"wheat"}, 0.35, 0, 45);
    }
}
