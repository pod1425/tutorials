package hw;

import java.util.Scanner;

public class home2 {
    public static void print(String text){
        System.out.println(text);
    }
    public static int askNumber(String massage){
        System.out.println(massage);
        return new Scanner(System.in).nextInt();
    }
    private static double calculate(double weight, double height) {
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    private static String BMICategory(double bmi) {
        if (bmi < 18.5) {
            return "underweight";
        } else if (bmi < 25) {
            return "normal";
        } else if (bmi < 30) {
            return "overweight";
        } else {
            return "obese";
        }
    }
    public static void main(String[] args){
        String resultmassage = "Your body mass index: ";
        String welcome  = "Welcome! You have entered the program in which you can calculate your BMI";
        System.out.println(welcome);
        double weight = askNumber("Input your weight in kilograms: ");
        int height = askNumber("Input your height in centimeters: ");
        double result = calculate(weight, height);
        print(resultmassage);
        System.out.println(result);
        System.out.println("You are " + BMICategory(result));
    }
}
