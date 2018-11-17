
public class Main {
    public static void main(String[] args) {
        System.out.println("Ordinary car:");
        Car ordinaryCar = new Car();
        CarOwner ordinaryPerson = new CarOwner("Ordinary Name");
        ordinaryCar.start(ordinaryPerson);
        ordinaryCar.drive(ordinaryPerson, 500);
        ordinaryCar.stop(ordinaryPerson);
        System.out.println("Bat Mobile:");
        BatMobile batMobile = new BatMobile();
        CarOwner batman = new CarOwner("Batman");
        batMobile.start(batman);
        batMobile.drive(batman, 1000);
        for (int i = 0; i < 15; i++)
            batMobile.shoot(batman);
        batMobile.stop(batman);
        batMobile.reload();
        batMobile.selfDestroy(batman);
        batMobile.drive(batman, 1000);
        batMobile.start(batman);
        batMobile.stop(batman);
        batMobile.shoot(batman);
        batMobile.reload();
        batMobile.selfDestroy(batman);
        batMobile.repair(batman);
        batMobile.drive(batman, 1000);
        batMobile.start(batman);
        batMobile.stop(batman);
        batMobile.shoot(batman);
        batMobile.reload();
        batMobile.selfDestroy(batman);
        System.out.println("TARDIS:");
        Car tardis = new Tardis();
    }
}
