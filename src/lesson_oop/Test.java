package lesson_oop;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight = inputWeight(scanner);
        double height = inputHeight(scanner);
        double BMI = calculateBMI(weight, height);
        printResult(BMI);
    }

    private static double inputWeight(Scanner scanner) {
        System.out.print("Введіть вагу у кг: ");
        return scanner.nextDouble();
    }

    private static double inputHeight(Scanner scanner) {
        System.out.print("Введіть зріст у см: ");
        return scanner.nextDouble() / 100;
    }

    private static double calculateBMI(double weight, double heigt) {
        return weight / square(heigt);
    }

    private static double square(double value) {
        return value * value;
    }

    private static void printResult(double BMI) {
        System.out.println("\nВаш ІМТ: " + BMI);
        System.out.println("Результат:");
        if (BMI < 18.5) {
            System.out.println("Недостатня вага");
        } else if (BMI < 25) {
            System.out.println("Нормальна вага");
        } else if (BMI < 30) {
            System.out.println("Надмірна вага");
        } else {
            System.out.println("Ожиріння");
        }
    }
}
