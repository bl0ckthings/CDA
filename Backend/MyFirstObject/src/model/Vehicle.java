package model;

 public abstract class Vehicle {


        private Integer id;
        private String brand;
        private String model;
        private int year;
        private Boolean hasEngine;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(Boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public Boolean start() {
        System.out.println("The " + brand + " " + model + " has started.");
        return true;
    }
}
