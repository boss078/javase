public class Game {
    public Game(String aName, int aCost, int aAgeLimit){
        name = aName;
        cost = aCost;
        ageLimit = aAgeLimit;
    }
    private String name;
    private double cost;
    private int ageLimit;
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
    public int getAgeLimit() {
        return ageLimit;
    }
}
