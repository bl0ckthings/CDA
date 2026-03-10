package model;
import interfaces.Flyable;

public class Plane extends  Vehicle implements Flyable {
    private Boolean yoke;
    private int numberOfEngines;



    public Boolean getYoke() {
        return yoke;
    }

    public void setYoke(Boolean yoke) {
        this.yoke = yoke;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public void fly(int flyspeed) {
        System.out.println("I can fly at " + flyspeed);
    }
}
