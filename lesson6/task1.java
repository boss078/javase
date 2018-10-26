public class task1 {
    public static void main(String[] args) {
        String players[] = new String[]{"Autonoob", "plsNotVAC", "HeadshotMaster"};
        int top = 3;
        PlayersSend(players, top);
    }
    public static void PlayersSend(String[] arrOfNicknames, int top){
        for (int i = 0; i < arrOfNicknames.length; i++){
            System.out.println("Congratulations, " + arrOfNicknames[i] + "! You finished your way to TOP " + top + "!");
        }
    }
}
