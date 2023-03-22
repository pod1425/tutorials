package lesson6.composition;

public class Car {
    public String brand;
    public int passengerSeats;
    public double fuel;
    public Engine engine;

    public Car(String brand, int passengerSeats, double fuel, String fuelType) {
        this.brand = brand;
        this.passengerSeats = passengerSeats;
        this.fuel = fuel;
        if (fuelType.equalsIgnoreCase("Gas")) {
            engine = new Engine(fuelType, 0.6, 400);
        } else if (fuelType.equalsIgnoreCase("Diesel")) {
            engine = new Engine(fuelType, 0.8, 800);
        } else if (fuelType.equalsIgnoreCase("Electric")) {
            engine = new Engine(fuelType, 0.2, 300);
        }
    }

    public void driveOneKilometer() {
        System.out.println("Car drives one kilometer...");
        engine.work();
        fuel -= engine.consumingPerKilometer;
    }

    public void checkFuel() {
        System.out.println("Fuel of this " + brand + " is at level " + fuel);
    }
}
