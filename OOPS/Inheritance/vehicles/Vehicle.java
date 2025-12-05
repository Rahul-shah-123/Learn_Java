package OOPS.Inheritance.vehicles;

public class Vehicle {
    private String engine;
    private int wheels;
    private int fuleTank;
    private String lights;

    public Vehicle(String engine, int wheels, int fuleTank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.fuleTank = fuleTank;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getFuleTank() {
        return fuleTank;
    }

    public String getLights() {
        return lights;
    }

    public String run(){
        return "Running";
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", fuleTank=" + fuleTank +
                ", lights='" + lights + '\'' +
                '}';
    }
}
