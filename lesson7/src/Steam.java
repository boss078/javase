public class Steam {
    //Constructors
    public Steam() {
        totalCash = 0;
        this.addGame("Red Dead Redemption 3(PC exclusive)", 34.59, 18);
        this.addGame("Pay Day 3(over9000 DLC not included)", 24.99, 16);
        this.addGame("S.T.A.L.K.E.R. 2", 40.00, 16);
        this.addGame("Mass Effect 4", 25.50, 18);
        this.addGame("PLAYERUNKNOWN'S BATTLEGROUNDS 2.0(now bug-free!)", 18.99, 16);
        this.addGame("Portal 3", 14.99, 12);
        this.addGame("Counter Strike: Reborn(free default textures!)", 19.99, 16);
        this.addGame("Call of Duty XVI: Pojezd sdelal bum", 34.99, 16);
        this.addGame("Assassin's Creed 0.5: Harsh Russia", 32.69, 18);
        this.addGame("Half-Life 3", 0.0, 0);
    }

    //Fields
    private double totalCash;
    private Game totalGames[] = new Game[100];


    //Getters
    public Game[] getTotalGames() {
        return totalGames;
    }

    public void sell(Game aGame, Player aPlayer) throws SteamSellException {
        for (int i = 0; i < aPlayer.getGames().length; i++) {
            if (aPlayer.getGames()[i] == aGame) {
                SteamSellException ex = new SteamSellException("AlreadyInLibrary");
                throw ex;
            }
        }
        if (aPlayer.getBalance() < aGame.getCost()) {
            SteamSellException ex = new SteamSellException("NotEnoughMoney");
            throw ex;
        } else {
            if (aPlayer.getAge() < aGame.getAgeLimit()) {
                SteamSellException ex = new SteamSellException("AgeErr");
                throw ex;
            }
        }
    }

    //add game function, if it is not enough totalGames[] length returns 1;
    public boolean addGame(String aName, double aCost, int aAgeLimit) {
        for (int i = 0; i < totalGames.length; i++) {
            if (totalGames[i] == null) {
                Game t = new Game(aName, aCost, aAgeLimit);
                totalGames[i] = t;
                return false;
            }
        }
        return true;
    }

    //Finds game by its name, if game is not found returns null
    public Game findGameByName(String aName) {
        for (int i = 0; i < totalGames.length; i++) {
            if (totalGames[i] != null && totalGames[i].getName() == aName) {
                return totalGames[i];
            }
        }
        return null;
    }

    //Default writing some info
    public int info() {
        System.out.println("****************************");
        System.out.println("Steam info");
        System.out.println("Game list: ");
        if (totalGames[0] != null) {
            for (int i = 0; i < totalGames.length; i++) {
                if (totalGames[i] == null)
                    break;
                totalGames[i].info(i);
            }
            System.out.println("****************************");
            return 0;
        } else {
            System.out.println("There is no games in Steam! Call Gaben to fix it: 8(800)555-35-55.");
            System.out.println("****************************");
            return 1;
        }
    }
}
