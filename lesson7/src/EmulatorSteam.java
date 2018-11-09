import java.util.Scanner;

public class EmulatorSteam {

    //Init values
    public static Player boss078;
    public static Steam steme = new Steam();

    public static void main(String[] args) {
        boolean isFinished = false;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~ Welcome to SBASH(Steam Born Again SHell)! ~");
            System.out.println("~ Entry menu                                ~");
            System.out.println("~ -Press 1 to create new account.           ~");
            System.out.println("~ -Press 2 to exit.                         ~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            switch (in.nextInt()) {
                case 1:
                    boss078 = new Player();
                    playerMenu();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    isFinished = true;
                    break;
                default:
                    System.out.println("You are typing shit, try again.");
            }
            if (isFinished) {
                break;
            }
        }
    }

    public static void playerMenu() {
        boolean isFinished = false;
        Scanner in = new Scanner(System.in);
        while (true) {
            boss078.info();
            System.out.println("Player menu");
            System.out.println("-Press 1 to launch any game from your library.");
            System.out.println("-Press 2 to buy new games in Steam.");
            System.out.println("-Press 3 to deposit some cash from your credit card.");
            System.out.println("-Press 4 to change your nickname.");
            System.out.println("-Press 5 to set your age.");
            System.out.println("-Press 6 to delete your account and exit to Entry Menu.");
            switch (in.nextInt()) {
                case 1:
                    if (boss078.getGames()[0] == null) {
                        System.out.println("Your library is empty!");
                        break;
                    }
                    System.out.println("Enter # of game, that you want to be launched.");
                    int i, t = in.nextInt();
                    if (t >= boss078.getGames().length || t < 0) {
                        System.out.println("Game with this # is not found.");
                        break;
                    }
                    for (i = 0; i < boss078.getGames().length; i++) {
                        if (i == t && boss078.getGames()[i] != null) {
                            System.out.println("Launching...");
                            if (boss078.getGames()[i].launch() == 1) {
                                System.out.println("Sorry, something went wrong(maybe it is because SBASH isn't connected to real Steam).");
                            }
                        }
                    }
                    break;
                case 2:
                    steamMenu();
                    break;
                case 3:
                    System.out.println("OK, lets do it.");
                    System.out.println("Firstly, enter # of your credit card.");
                    if (in.next() != "") {
                        System.out.println("Secondly, enter security code.");
                        if (in.next() != "") {
                            System.out.println("Finally, enter amount of USD(use \",\").");
                            double t1 = in.nextDouble();
                            if (t1 > 0.0) {
                                System.out.println("...");
                                boss078.deposit(t1);
                                System.out.println("...");
                                System.out.println("Transaction completed.");
                                System.out.println("If you got problem with transactions, please call 8(800)555-35-55.");

                            } else {
                                System.out.println("That value is <= 0!");
                                System.out.println("Returning to Player menu...");
                            }
                        } else {
                            System.out.println("That cannot be true!");
                            System.out.println("Returning to Player menu...");
                        }
                    } else {
                        System.out.println("That cannot be true!");
                        System.out.println("Returning to Player menu...");
                    }
                    break;
                case 4:
                    System.out.println("Your current nickname is: " + boss078.getNickname());
                    System.out.println("Enter your new nickname.");
                    boss078.changeNickname(in.next());
                    System.out.println("Nickname change completed.");
                    break;
                case 5:
                    System.out.println("Your current age is: " + boss078.getAge());
                    System.out.println("Enter your new age.");
                    boss078.setAge(in.nextInt());
                    System.out.println("Age change completed.");
                    break;
                case 6:
                    isFinished = true;
                    System.out.println("Deleting account...");
                    boss078 = null;
                    System.out.println("Done.");
                    System.out.println("Returning to Entry menu...");
                    break;
            }
            if (isFinished) {
                break;
            }
        }
    }

    public static void steamMenu() {
        boolean isFinished = false;
        Scanner in = new Scanner(System.in);
        while (true) {
            int errCode1 = steme.info();
            if (errCode1 == 1) {
                System.out.println("Returning to the Player Menu...");
                break;
            }
            System.out.println("Your current balance is: " + boss078.getBalance());
            System.out.println("Enter the number of game, which you want to buy or \"-1\" to return to the Player Menu.");
            while (true) {
                int t = in.nextInt();
                if (t == -1) {
                    isFinished = true;
                    break;
                }
                if (steme.getTotalGames()[t] != null) {
                    int errCode = boss078.Buy(steme.getTotalGames()[t], steme);
                    switch (errCode) {
                        case 0:
                            System.out.println("Transaction completed successfully. Check your library. Have fun.");
                            System.out.println("If you got problem with transactions, please call 8(800)555-35-55.");
                            break;
                        case 1:
                            System.out.println("Not enough money, loser!");
                            break;
                        case 2:
                            System.out.println("You are too young to play this game. Try this perfect free 1game: https://minecraft.net/en-us/download/ (if link is not working just copy and past in your browser).");
                            break;
                        case 3:
                            System.out.println("This game is already in your library. How could you forget?");
                            break;
                    }
                    System.out.println("Returning to Steam menu...");
                    break;
                } else {
                    System.out.println("Error #404(You are typing shit). Try again.");
                }
            }
            if (isFinished) {
                System.out.println("Returning to the Player Menu...");
                break;
            }
        }
    }
}
