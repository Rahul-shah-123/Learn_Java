package OOPS;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setDoors("close");
        car.setDriver("ready");
        car.setEngine("off");
        car.setSpeed(10);
        System.out.println(car.run());

    }
}
