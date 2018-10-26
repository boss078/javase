public class task4 {
    public static class RaidBoss{
        RaidBoss(double InitHealthPoints, double InitRegenerationPerMinutePercents){
            this.healthPoints = InitHealthPoints;
            this.RegenerationPerMinutePercents = InitRegenerationPerMinutePercents;
        }
        private double healthPoints;
        private double RegenerationPerMinutePercents;
        public void Time(int hours){
            for (int i = 0; i < hours; i++){
                healthPoints = (100 + RegenerationPerMinutePercents) * 0.01 * healthPoints;
            }
        }

        public double getHealthPoints() {
            return healthPoints;
        }
        public String DifficultyForTeam(double damagePerHour){
            if (damagePerHour > (RegenerationPerMinutePercents * 0.01 * healthPoints * 60) * 10) {
                return "EASY";
            }
            if (damagePerHour > (RegenerationPerMinutePercents * 0.01 * healthPoints * 60) * 4) {
                return "NORMAL";
            }
            if (damagePerHour > (RegenerationPerMinutePercents * 0.01 * healthPoints * 60) * 1.5) {
                return "HARD";
            }
            if (damagePerHour > RegenerationPerMinutePercents * 0.01 * healthPoints * 60) {
                return "INSANE";
            }
            if (damagePerHour <= RegenerationPerMinutePercents * 0.01 * healthPoints * 60) {
                return "IMPOSSIBLE";
            }
            return "SOMETHING";
        }
    }
    public static void main(String[] args) {
        RaidBoss Mimic = new RaidBoss(100, 1);
        double avarageDamagePerHour = 2000;
        switch (Mimic.DifficultyForTeam(avarageDamagePerHour)) {
            case "EASY":
                System.out.println("That would be easy raid, because difficulty is on mini... Um, because you are professionals, I suppose.");
                break;
            case "NORMAL":
                System.out.println("Just another fight, nothing really hard.");
                break;
            case "HARD":
                System.out.println("I hope you are well prepared, because it wouldn't be easy.");
                break;
            case "INSANE":
                System.out.println("Prepare to fight with your worst nightmare.");
                break;
            case "IMPOSSIBLE":
                System.out.println("GET RECT M8! It is impossible even in theory!");
                break;
            case "SOMETHING":
                System.out.println("Something went wrong. Obviously, this message would never appear, so I don't know, why I'm still typing this.");
                break;
        }
    }
}
