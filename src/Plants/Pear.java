package Plants;

public class Pear extends Plant {
    public static String type = "pear";
    public static double plant_cost = 1200;
    public static double protect_cost = 200;
    public static int efficiency = 150;
    public static int grow_time = 60;
    public static int collect_cost = 80;
    public static double buy_price = 20;
    public static double sell_price = 18;

    public Pear() {
        super("pear", 1200, 200, 150, 60, 80, 20, 18);
    }
}
