package OOPS;

import javax.swing.*;

public class Car {
    private int speed;
    private String doors;
    private String engine;
    private String driver;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String run (){
        if(getDoors().equals("close") && getDriver().equals("ready") && getEngine().equals("on")
           && getSpeed() == 10){
            return "Running";
        }else {
            return "Not Running";
        }


    }
}
