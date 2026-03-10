package model;

public class Plane extends  Vehicle {
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
}
