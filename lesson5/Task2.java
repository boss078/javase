public class Task2 {

    static int pointsEarnedFirstGamer = 0, pointsEarnedSecondGamer = 0, pointsPerKill = 100, pointsBonus = 1000;

    public static void pointsCounter(int countKillTanksFirstGamer, int countKillTanksSecondGamer) {
        if ( countKillTanksFirstGamer > countKillTanksSecondGamer) {
            pointsEarnedFirstGamer = countKillTanksFirstGamer * pointsPerKill + pointsBonus;
            pointsEarnedSecondGamer = countKillTanksSecondGamer * pointsPerKill;
            System.out.println("Second player earned " + pointsEarnedSecondGamer + ", first before bonus " + (pointsEarnedFirstGamer - pointsBonus) + ", after - " + pointsEarnedFirstGamer);
        }
        else
            if (countKillTanksFirstGamer < countKillTanksSecondGamer) {
                pointsEarnedFirstGamer = countKillTanksFirstGamer * pointsPerKill;
                pointsEarnedSecondGamer = countKillTanksSecondGamer * pointsPerKill + pointsBonus;
                System.out.println("First player earned " + pointsEarnedFirstGamer + ", second before bonus " + (pointsEarnedSecondGamer - pointsBonus) + ", after - " + pointsEarnedSecondGamer);
            }
            else {
                pointsEarnedFirstGamer = countKillTanksFirstGamer * pointsPerKill;
                pointsEarnedSecondGamer = countKillTanksSecondGamer * pointsPerKill;
                System.out.println("First player earned " + pointsEarnedFirstGamer + ", second " + pointsEarnedSecondGamer);
            }
    }

    public static void main(String[] args) {
        pointsCounter(17, 17);
    }
}