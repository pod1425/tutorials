package lesson6.composition;

public class Engine {
    public double horsePower;
    public double consumingPerKilometer;
    public String fuelType;

    public Engine(String fuelType, double consumingPerKilometer, double horsePower) {
        this.fuelType = fuelType;
        this.consumingPerKilometer = consumingPerKilometer;
        this.horsePower = horsePower;
    }

    void work() {
        if (fuelType.equalsIgnoreCase("electric")) {
            System.out.println("Engine works quietly...");
        } else {
            System.out.println("Engine works loudly...");
        }
    }
}
