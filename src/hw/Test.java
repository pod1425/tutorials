package hw;

import java.util.Scanner;

public class Test {

    public static int askNumber(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {
        double weight = askNumber("Input your weight in kilograms: ");
        int height = askNumber("Input your height in centimeters: ");
        double result = (weight) / (height / 100.0 * height / 100.0);
        System.out.println("Your body mass index: " + result);
    }
}
