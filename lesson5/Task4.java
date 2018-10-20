public class Task4 {
    public static double enemyDamageRecieved(String typeOfEnemy, String attributeOfWeapon, double initDamage) {
        switch (attributeOfWeapon) {
            case "HOLY" :
                switch (typeOfEnemy) {
                    case "UNDEAD":
                    case "ZOMBIE":
                        return initDamage * 1.5;
                    case "SAINT":
                        return initDamage / 2;
                    case "HUMANOID":
                    case "ANIMAL":
                    case "PLANT":
                    case "GHOST":
                        return initDamage;
                }
                break;
        }
        return initDamage;
    }

    public static void main(String[] args) {
        String enemyType = "ZOMBIE";
        String weaponAttribute = "HOLY";
        double weaponDamage = 1000;
        System.out.println(enemyDamageRecieved(enemyType, weaponAttribute, weaponDamage) );
    }
}
