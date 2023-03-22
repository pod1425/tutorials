package test;

public class Hw1 {
    public static void main(String[] args) {
        int height = 171;
        int weight = 64;
        double bmi = calculateBmi(height, weight);
        System.out.println("bmi = " + bmi);
    }

    public static double calculateBmi (int height, int weight) {
        return weight / (height / 100.0 * height / 100.0);
    }
}
