public class Task3 {
    public static void HPcolor(double hp) {
        if (hp <= 25)
            System.out.println("RED");
        else
            if (hp <= 50)
                System.out.println("ORANGE");
            else
                if (hp <= 75)
                    System.out.println("YELLOW");
                else
                    System.out.println("GREEN");
    }

    public static void main(String[] args) {
        double hp = 75;
        HPcolor(hp);
    }
}
