package Plants;

public class Arugula extends Plant {
    public static String type = "arugula";
    public static double plant_cost = 100;
    public static double protect_cost = 100;
    public static int efficiency = 20;
    public static int grow_time = 10;
    public static int collect_cost = 50;
    public static double buy_price = 12;
    public static double sell_price = 10;

    public Arugula() {
        super("arugula", 100, 100, 20, 10, 50, 12, 10);
    }
}
