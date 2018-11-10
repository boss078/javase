public class Tardis extends Car {

    Tardis() {
        currentYear = 2018;
        isInTimeVortex = false;
    }

    private int currentYear;
    private boolean isInTimeVortex;

    public void timeTravel(CarOwner aOwner, int destinationYear) {
        if (isInTimeVortex) {
            currentYear = destinationYear;
            System.out.println(aOwner.getName() + " clicks some buttons, pull down big lever, and TARDIS travels to " + destinationYear + " year.");
        } else {
            System.out.println("TARDIS cannot make time jump, while it is materialized.");
        }
    }

}
