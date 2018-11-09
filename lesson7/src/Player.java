import java.sql.SQLOutput;

public class Player {
    //Constructors
    public Player() {
        nickname = "Empty";
        balance = 0.0;
        age = 0;
    }

    //Fields
    private String nickname;
    private double balance;
    private int age;
    private Game games[] = new Game[10];

    //Getters
    public double getBalance() {
        return balance;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public Game[] getGames() {
        return games;
    }

    //Setters
    public void deposit(double aMoney) {
        this.balance += aMoney;
    }

    public void changeNickname(String aNickname) {
        this.nickname = aNickname;
    }

    public void setAge(int aAge) {
        this.age = aAge;
    }

    //function, that sends request to steam for confirmation
    public int Buy(Game aGame, Steam aSteam) {
        try {
            aSteam.sell(aGame, this);
        } catch (SteamSellException ex) {
            if (ex.getMessage() == "NotEnoughMoney")
                return 1;
            if (ex.getMessage() == "AgeErr")
                return 2;
            if (ex.getMessage() == "AlreadyInLibrary")
                return 3;
        }
        for (int i = 0; i < 10; i++) {
            if (games[i] == null) {
                games[i] = aGame;
                balance -= aGame.getCost();
                break;
            }
        }
        return 0;
    }
    public void info(){
        System.out.println("****************************");
        System.out.println("Player info");
        System.out.println("Nickname: " + nickname);
        System.out.println("Balance: " + balance);
        System.out.println("Age: " + age);
        System.out.println("Your library: ");
        for(int i = 0; i < games.length; i++){
            if (games[i] != null){
                games[i].info(i);
            }
        }
        System.out.println("****************************");
    }
}
