public class Game {
    public Game(String aName, double aCost, int aAgeLimit) {
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

    //Even trying to launch game
    public int launch() {
        return 1;
    }

    public void info(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Game info");
        System.out.println("Name: " + name);
        System.out.println("Cost: " + cost);
        System.out.println("Age limit: " + ageLimit + "+");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void info(int num){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Game #" + num + " info");
        System.out.println("Name: " + name);
        System.out.println("Cost: " + cost);
        System.out.println("Age limit: " + ageLimit + "+");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
