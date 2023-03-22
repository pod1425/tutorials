package lesson6;

import lesson6.composition.Car;

public class ClassInterractions {

    public static void main(String[] args) {
        Car myTesla = new Car("Tesla", 5, 700, "Electric");
        myTesla.checkFuel();
        myTesla.driveOneKilometer();
        myTesla.driveOneKilometer();
        myTesla.driveOneKilometer();
        myTesla.checkFuel();
    }
}
