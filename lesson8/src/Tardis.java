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
            System.out.println(aOwner.getName() + " clicks some buttons and TARDIS travels to " + destinationYear + " year.");
        } else {
            System.out.println("TARDIS cannot make time jump, while she is materialized.");
        }
    }
    public void dematerialize(CarOwner aOwner){
        if (!isInTimeVortex){
            System.out.println("Here we go, " + aOwner + " pulls down big lever and TARDIS passes through dimensions and fells into the time vortex.");
            isInTimeVortex = true;
        } else {
            System.out.println("TARDIS is already dematerialized.");
        }
    }
    public void materealize(CarOwner aOwner){
        if (isInTimeVortex){
            System.out.println(aOwner + " pulls up big lever and TARDIS crashes into our reality, entering the " + currentYear + "'s.");
            isInTimeVortex = false;
        } else {
            System.out.println("TARDIS is already materialized.");
        }
    }
    public void deactivateTranslationSystem(CarOwner aOwner){
        System.out.println("Now " + aOwner + " can see on TARDIS interior blackboard words \"Ph’nglui mglw’nafh Cthulhu R’lyeh wgah’nagl fhtagn\".");
    }
    public void activateTranslationSystem(CarOwner aOwner){
        System.out.println("Now " + aOwner + " can see on TARDIS interior blackboard words \"In his house at R’lyeh dead Cthulhu waits dreaming\".");
    }
}
