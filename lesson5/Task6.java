import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task6 {
    public static double DistanceBetweenPoints(double aX, double aY, double bX, double bY) {
        return sqrt( pow(aX - bX, 2) + pow(aY - bY, 2) );
    }

    public static void main(String[] args) {
        double playerX = 5.0, playerY = 5.0, npcX = 10.0, npcY = 10.0;
        System.out.println(DistanceBetweenPoints(playerX, playerY, npcX, npcY));
    }
}
