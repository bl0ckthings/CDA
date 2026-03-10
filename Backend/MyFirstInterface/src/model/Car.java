package model;

public class Car extends Vehicle {
    private int wheelInch;
    private Boolean hasRearCamera;

    public Car() {
    }

    public Car(int wheelInch, Boolean hasRearCamera) {
        this.wheelInch = wheelInch;
        this.hasRearCamera = hasRearCamera;
    }

    public int getWheelInch(int i) {
        return wheelInch;
    }

    public void setWheelInch(int wheelInch) {
        this.wheelInch = wheelInch;
    }

    public Boolean getHasRearCamera(boolean b) {
        return hasRearCamera;
    }

    public void setHasRearCamera(Boolean hasRearCamera) {
        this.hasRearCamera = hasRearCamera;
    }
}
