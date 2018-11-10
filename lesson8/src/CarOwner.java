public class CarOwner {
    CarOwner() {
        this("Undefined");
    }

    CarOwner(String aName) {
        name = aName;
    }

    private String name;
    private Car itsCar;

    public String getName() {
        return name;
    }

    public Car getItsCar() {
        return itsCar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItsCar(Car itsCar) {
        this.itsCar = itsCar;
    }
}
