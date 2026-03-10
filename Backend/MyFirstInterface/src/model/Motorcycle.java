package model;

import interfaces.Flyable;

public class Motorcycle extends Vehicle  implements Flyable {
    private String brand;

    public Motorcycle() {

    }

    public Motorcycle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void fly(int flyspeed) {
    System.out.println("I'm flying at " + flyspeed + "km/h and i am black");
    }
}
