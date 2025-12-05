package OOPS;

import OOPS.Inheritance.vehicles.Bike;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("on",2,21,"LED","Short");
        System.out.println(bike.run());
    }
}
