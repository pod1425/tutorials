package hw;

import java.util.Scanner;

public class Test {

    public static void print(String text){
        System.out.println(text);
    }

    public static int askNumber(String massage){
        System.out.println(massage);
        return new Scanner(System.in).nextInt();
    }

    public static void main(String[] args){
        String resultmassage = "Your body mass index: ";
        System.out.println("Welcome! You have entered the program in which you can calculate your BMI");
        double weight = askNumber("Input your weight in kilograms: ");
        int height = askNumber("Input your height in centimeters: ");
        double result  = (weight) / (height / 100.0 * height / 100.0);
        print(resultmassage);
        System.out.println(result);
    }
}
