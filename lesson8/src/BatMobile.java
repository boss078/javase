import java.util.Random;

public class BatMobile extends Car {
    private final static Random random = new Random();
    private int ammoLeft;
    private boolean isDestoyed;

    BatMobile() {
        this.speed = 100;
        this.isWorking = false;
        this.ammoLeft = 10;
        this.isDestoyed = false;
    }

    @Override
    public void stop(CarOwner aOwner) {
        if (!isDestoyed) {
            super.stop(aOwner);
        } else {
            System.out.println("Bat Mobile is destroyed.");
        }
    }

    @Override
    public void start(CarOwner aOwner) {
        if (!isDestoyed)
            super.start(aOwner);
        else
            System.out.println("Bat Mobile is destroyed.");
    }

    @Override
    public int drive(CarOwner aOwner, int howLong) {
        if (!isDestoyed) {
            if (isWorking) {
                System.out.println(aOwner.getName() + " drive his Bat Mobile during " + howLong + " seconds, " + howLong * speed + " meters smashed.");
                return speed * howLong;
            } else {
                System.out.println(aOwner.getName() + " try to drive his Bat Mobile during " + howLong + " seconds, but engine is not working, so he looks stupid right now.");
                return 0;
            }
        } else {
            System.out.println("Bat Mobile is destroyed.");
            return 0;
        }
    }

    public void shoot(CarOwner aOwner) {
        if (!isDestoyed) {
            if (ammoLeft > 0) {
                ammoLeft--;
                if (random.nextBoolean())
                    System.out.println("Another dead(he is not really dead, because " + aOwner.getName() + " is not killing anyone) bad guy.");
                else
                    System.out.println("Missed one!");
            } else
                System.out.println("No ammo!");
        } else
            System.out.println("Bat Mobile is destroyed.");
    }

    public void selfDestroy(CarOwner aOwner) {
        if (!isDestoyed) {
            System.out.println(aOwner.getName() + " starts self destroy, so Bat Mobile is now destroyed.");
            isDestoyed = true;
            isWorking = false;
        } else
            System.out.println("Bat Mobile is already destroyed.");
    }

    public void reload() {
        if (!isDestoyed) {
            ammoLeft = 10;
            System.out.println("Ammo restored!");
        } else
            System.out.println("Bat Mobile is destroyed.");
    }

    public void repair(CarOwner aOwner) {
        if (isDestoyed) {
            System.out.println(aOwner.getName() + " spend days to repair Bat Mobile, so now it is working again(ammo restored).");
            ammoLeft = 10;
            isDestoyed = false;
        } else
            System.out.println("Bat Mobile is already repaired.");
    }
}