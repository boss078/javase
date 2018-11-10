public class Car {
    protected boolean isWorking;
    protected int speed;

    Car() {
        isWorking = false;
        speed = 20;
    }

    public void start(CarOwner aOwner) {
        System.out.println("Car owner " + aOwner.getName() + " starts the engine.");
        isWorking = true;
        System.out.println("Wrom-wroom!");
    }

    public void stop(CarOwner aOwner) {
        System.out.println("Car owner " + aOwner.getName() + " stops the engine.");
        isWorking = false;
        System.out.println("Pshhhh.");
    }

    public int drive(CarOwner aOwner, int howLong) {
        if (isWorking) {
            System.out.println("Car owner " + aOwner.getName() + " drive his car during " + howLong + " seconds, " + howLong * speed + " meters passed.");
            return speed * howLong;
        } else {
            System.out.println("Car owner " + aOwner.getName() + " try to drive his car during " + howLong + " seconds, but engine is not working.");
            return 0;
        }
    }
}
