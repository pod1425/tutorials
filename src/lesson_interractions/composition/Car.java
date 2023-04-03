package lesson_interractions.composition;

public class Car {
    public int passengers;
    public double fuelAmount;
    public double mass;
    public Engine engine;

    public Car(int passengers, double fuelAmount, double mass, String fuelType) {
        this.passengers = passengers;
        this.fuelAmount = fuelAmount;
        this.mass = mass;
        if (fuelType.equalsIgnoreCase("Diesel")) {
            engine = new Engine(400, 0.2, 11.5, fuelType);
        } else if (fuelType.equalsIgnoreCase("Gas")) {
            engine = new Engine(300, 0.15, 15.0, fuelType);
        }
    }

    public void driveOneKilometer() {
        if (engine.oilLevel < 0) {
            System.out.println("Car is broken!");
            return;
        }
        if (fuelAmount < engine.fuelPerKilometer) {
            System.out.println("Not enough " + engine.fuelType + " to ride another kilometer");
            return;
        }
        engine.work();
        System.out.println("The car moved " + passengers + " people one kilometer!");
        fuelAmount -= engine.fuelPerKilometer;
        engine.oilLevel -= 0.0001;
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                ", fuelAmount=" + fuelAmount +
                ", mass=" + mass +
                engine.toString() +
                '}';
    }
}
