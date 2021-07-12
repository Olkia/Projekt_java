package Plants;


import java.util.Arrays;

public class Plant {
    public int age = 0;
    public String type = "";
    public boolean isPlanted = false;
    public double plant_cost = 0;
    public double protect_cost = 0;
    public int efficiency = 0;
    public int grow_time = 0;
    public int[] weeks_to_plant = PlantHelper.seasons();
    public double collect_cost = 0;
     public double buy_price = 0;
    public double sell_price = 0;

    public Plant(String type, double plant_cost, double protect_cost, int efficiency, int grow_time, double collect_cost, double buy_price, double sell_price) {
        this.type = type;
        this.plant_cost = plant_cost;
        this.protect_cost = protect_cost;
        this.efficiency = efficiency;
        this.grow_time = grow_time;
        this.collect_cost = collect_cost;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
    }

    public String presentation() {
        String to = "";
        to += "Rodzaj rośliny  -  " + this.type + "\t czas rośnięcia  -  " + this.grow_time;
        if (this.isPlanted) {
            to += "Rośnie już " + this.age + " tygodni";
            if (this.age >= this.grow_time) to += "\t Gotowa do zbioru";
            else to += "\t Jeszcze nie gotowa do zbioru";
        } else to += "\t Nie jest posadzona";
        return to;
    }

    public void grow() {
        if (isPlanted) age++;
    }

    public boolean isAdult() {
        return age >= grow_time;
    }

    public boolean checkSeason(int week){
        for (Integer i: weeks_to_plant) {
            if(week == i) return true;
        }
        return false;
    }

    public void plant() {
        this.isPlanted = true;
    }


}
