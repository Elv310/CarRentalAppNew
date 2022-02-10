package com.careerdevs;

import java.util.ArrayList;

public class RentalService {
    public static void main(String[] args) {
       Car[] carStorage = new Car[3];
       Car car1 = new Car("Honda","accord", false);
        Car car2 = new Car("Jeep","renegade", false);
        Car car3 = new Car("Kia","Forte", false);

        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;
        System.out.println(carStorage[0].getMake());
    }
}
