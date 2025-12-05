package OOPS.Inheritance.vehicles;

public class Bike extends Vehicle {
    private String handle = "Seated";

    public Bike(String engine, int wheels, int fuleTank, String lights, String handle) {
        super(engine, wheels, fuleTank, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String run(){
        return "Not Running.....!";
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();
    }
}
