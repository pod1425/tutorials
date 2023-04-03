package lesson_interractions;

import lesson_interractions.composition.Car;

public class Demo {
    public static void main(String[] args) {
        Car myCar = new Car(4, 200, 3.5, "diesel");
        System.out.println(myCar);
        myCar.driveOneKilometer();
        myCar.driveOneKilometer();
        myCar.driveOneKilometer();
        System.out.println(myCar);
    }
}
