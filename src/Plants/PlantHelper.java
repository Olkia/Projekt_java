package Plants;

public class PlantHelper {
    public static int[] seasons() {
        int[] tab = new int[20];
        for (int i = 0; i < 20; i++) {
            tab[i] = i + 20;
        }
        return tab;
    }
}
