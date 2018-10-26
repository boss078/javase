public class task3 {
    public static class RaidBoss{
        RaidBoss(double InitHealthPoints, double InitRegenerationPerHourPercents){
            this.healthPoints = InitHealthPoints;
            this.RegenerationPerHourPercents = InitRegenerationPerHourPercents;
        }
        private double healthPoints;
        private double RegenerationPerHourPercents;
        public void Time(int hours){
            for (int i = 0; i < hours; i++){
                healthPoints = (100 + RegenerationPerHourPercents) * 0.01 * healthPoints;
            }
        }

        public double getHealthPoints() {
            return healthPoints;
        }
    }
    public static void main(String[] args) {
        RaidBoss Mimic = new RaidBoss(3000, 50);
        System.out.println("Mimic hp: " + Mimic.getHealthPoints());
        System.out.println("3 hours passed...");
        Mimic.Time(3);
        System.out.println("Mimic hp: " + Mimic.getHealthPoints());
    }
}
