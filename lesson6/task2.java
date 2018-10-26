public class task2 {
    public static void main(String[] args) {
        String[] playersList = new String[]{"DeadlyRabbit", "Invisible", "SashaSimple", "RageHunter", "DarkKnight", "Im26!!", "SkilledEnough"};
        int[] amountOfPlayersGems = new int[]{2048, 0, 9999, 512, 2001, 322, 1338};
        int minAmount = 1337;
        int gemsPerPlayer = 322;
        System.out.println("Amount of wasted for nothing gems: " + AmountOfAllEventGems(playersList, amountOfPlayersGems, gemsPerPlayer, minAmount));
    }
        public static int AmountOfAllEventGems(String[] playersList, int[] scoresOfPlayers, int gemsPerPlayer, int AmountMinToWin){
            int amountOfAllGems = 0;
            System.out.println("List of succeeded players: ");
            for (int i = 0; i < playersList.length; i++){
                if (scoresOfPlayers[i] > AmountMinToWin){
                    System.out.println(playersList[i] + " ");
                    amountOfAllGems += gemsPerPlayer;
                }
            }
            return amountOfAllGems;
        }
}