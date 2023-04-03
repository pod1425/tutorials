package lesson_interractions.composition;

public class Engine {
    public int power;
    public double fuelPerKilometer;
    public double oilLevel;
    public String fuelType;

    public Engine(int power, double fuelPerKilometer, double oilLevel, String fuelType) {
        this.power = power;
        this.fuelPerKilometer = fuelPerKilometer;
        this.oilLevel = oilLevel;
        this.fuelType = fuelType;
    }

    public void work() {
        System.out.println(fuelType + " engine working!");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", fuelPerKilometer=" + fuelPerKilometer +
                ", oilLevel=" + oilLevel +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
