package com.careerdevs;

public class Car {
    private String make;
    private String model;
    private boolean rented;

    public Car(String make, String model, boolean rented) {
        this.make = make;
        this.model = model;
        this.rented = rented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", rented=" + rented +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }




}
