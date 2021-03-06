package Animals;

public class Animal {
    public int age = 1;
    public String type = "";
    public double buy_cost = 1000;
    public double kgs_week = 3;
    public int weeks_adult = 15;
    public int eat_per_week = 3;//kg
    public String[] foods = {"wheat", "beetroot", "apple"};
    public double reproductionChance = 0.1;
    public double earnings_per_week = 80;
    public double money_per_kg = 40;

    public Animal(String type, double buy_cost, double kgs_week, int weeks_adult, int eat_per_week, String[] foods, double reproductionChance, double earnings_per_week, double money_per_kg) {
        this.type = type;
        this.buy_cost = buy_cost;
        this.kgs_week = kgs_week;
        this.weeks_adult = weeks_adult;
        this.eat_per_week = eat_per_week;
        this.foods = foods;
        this.reproductionChance = reproductionChance;
        this.earnings_per_week = earnings_per_week;
        this.money_per_kg = money_per_kg;
    }

    public void grow() {
        age++;
    }

    public String presentation() {
        String to = "";
        to += "Rodzaj zwierzęcia - " + this.type + "\t wiek zwierzęcia - " + this.age;
        if (this.isAdult()) to += " (dorosłe) ";
        else to += " (dziecko) ";
        to += "\t Waga zwierzęcia  -  " + this.age * this.kgs_week;
        return to;
    }

    public boolean isAdult() {
        return age >= weeks_adult;
    }

    // Animal an = new Cow();

}
